package com.chatapp.chatapp.config;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.chatapp.chatapp.chat.ChatMessage;
import com.chatapp.chatapp.chat.MessageType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {
  private final SimpMessageSendingOperations messageTemplete;
  @EventListener
  public void handleWebSocketDisconnectListener(SessionDisconnectEvent session){
    StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(session.getMessage());
    String username =(String) stompHeaderAccessor.getSessionAttributes().get("username");
    if(username!=null){
      log.info("User Disconnected : {}", username);
      var chatMessage = ChatMessage.builder()
      .type(MessageType.LEAVE)
      .sender(username)
      .build();
      messageTemplete.convertAndSend("/topic/public", chatMessage);
    }
  }
}