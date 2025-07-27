package com.example.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository repository;

    public void saveMessage(ChatMessage message) {
        repository.save(message);
    }

    public List<ChatMessage> getAllMessages() {
        return repository.findAll();
    }
}
