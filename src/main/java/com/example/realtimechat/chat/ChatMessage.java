package com.example.realtimechat.chat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
}
