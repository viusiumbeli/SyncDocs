package com.sync.docs.data.network.repository;

public interface Message {
    void createMessage(String url, String requestId);

    void readMessage(String fullUrl, String requestId);

    void onClear();
}
