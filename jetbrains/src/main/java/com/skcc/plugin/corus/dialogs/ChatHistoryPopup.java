package com.skcc.plugin.corus.dialogs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBScrollPane;
import com.skcc.plugin.corus.response.TopicItem;
import com.skcc.plugin.corus.response.TopicResponse;
import com.skcc.plugin.corus.utils.HttpUtils;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class ChatHistoryPopup extends DialogWrapper {
    private final JBList<TopicItem> topicList;
    private final JTextPane textPane;
    private final JTextField searchField;
    private final JBScrollPane topicListScrollPane;
    private final JScrollPane textPaneScrollPane;
    private final DefaultListModel<TopicItem> listModel = new DefaultListModel<>();
    private List<TopicItem> topicItems = null;

    private static class TopicItemRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof TopicItem topicItem) {
                label.setText(topicItem.getDescription());
            }
            return label;
        }
    }

    public ChatHistoryPopup() {
        super(true);

        topicList = new JBList<>();
        topicList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        topicList.setCellRenderer(new TopicItemRenderer());
        topicList.addListSelectionListener(e -> updateTopicContent());

        textPane = new JTextPane();
        textPane.setEditable(false);

        topicListScrollPane = new JBScrollPane(topicList);
        textPaneScrollPane = new JBScrollPane(textPane);

        searchField = new JTextField();
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateTopicList();
            }
        });

        init();

        setOKActionEnabled(false);
        setTitle("채팅 기록");
        getAllTopicList();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel centerPanel = new JPanel(new BorderLayout());

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.add(searchField, BorderLayout.CENTER);

        centerPanel.add(searchPanel, BorderLayout.NORTH);
        centerPanel.add(topicListScrollPane, BorderLayout.WEST);
        centerPanel.add(textPaneScrollPane, BorderLayout.CENTER);

        centerPanel.setPreferredSize(new Dimension(600, 400));

        return centerPanel;
    }

    private void updateTopicList() {
        String searchText = searchField.getText().toLowerCase(); // 검색어를 소문자로 변환하여 비교

        DefaultListModel<TopicItem> filteredModel = new DefaultListModel<>();

        // 역순으로 검색하여 필터링된 데이터 추가
        for (int i = topicItems.size() - 1; i >= 0; i--) {
            TopicItem topic = topicItems.get(i);
            String description = topic.getDescription().toLowerCase();
            if (description.contains(searchText)) {
                filteredModel.addElement(topic);
            }
        }

        topicList.setModel(filteredModel);
    }

    private void getAllTopicList() {
        // 일괄 수신
        CompletableFuture<String> futureResponse = HttpUtils.getTopicAsync();
        futureResponse.thenAccept(response -> {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                TopicResponse topicResponse = objectMapper.readValue(response, TopicResponse.class);
                topicItems = Objects.requireNonNull(topicResponse).getTopics();

                for (int i = topicItems.size() - 1; i >= 0; i--) {
                    TopicItem topicItem = topicItems.get(i);
                    listModel.addElement(topicItem);
                }

                topicList.setModel(listModel);
                setOKActionEnabled(topicList.getModel().getSize() > 0);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void updateTopicContent() {
        TopicItem selectedTopicName = topicList.getSelectedValue();
        if (selectedTopicName != null) {
            textPane.setText(selectedTopicName.getDescription());
        }
    }
}