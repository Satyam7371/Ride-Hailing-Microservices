package org.example.ubersocketserver.controllers;

import org.example.ubersocketserver.dto.ChatRequestDto;
import org.example.ubersocketserver.dto.ChatResponseDto;
import org.example.ubersocketserver.dto.TestRequestDto;
import org.example.ubersocketserver.dto.TestResponseDto;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

//@Controller
//public class TestController {
//
//    private final SimpMessagingTemplate simpMessagingTemplate;
//
//
//    public TestController(SimpMessagingTemplate simpMessagingTemplate) {
//        this.simpMessagingTemplate = simpMessagingTemplate;
//    }
//
//    @MessageMapping("/ping")
//    @SendTo("/topic/ping")
//    public TestResponseDto pingCheck(TestRequestDto message) {
//        System.out.println("Received message from client " + message.getData());
//        return TestResponseDto.builder().data("Received").build();
//    }
//
//
////    @Scheduled(fixedDelay = 2000)
////    public void sendPeriodicMessage() {
////        System.out.println("Executed periodic function");
////        simpMessagingTemplate.convertAndSend("/topic/scheduled", "Periodic Message sent " + System.currentTimeMillis());
////    }
//
//    @MessageMapping("/chat/{room}")
//    @SendTo("/topic/message/{room}")
//    public ChatResponseDto chatMessage(@DestinationVariable String room, ChatRequestDto request) {
//        return ChatResponseDto.builder()
//                .name(request.getName())
//                .message(request.getMessage())
//                .timeStamp("" + System.currentTimeMillis())
//                .build();
//    }
//
//    @MessageMapping("/privateChat/{room}/{userId}")
////    @SendTo("/topic/privateMessage/{room}/{userId}")
//    public void privateChatMessage(@DestinationVariable String room, @DestinationVariable String userId, ChatRequestDto request) {
//        ChatResponseDto response =  ChatResponseDto.builder()
//                .name(request.getName())
//                .message(request.getMessage())
//                .timeStamp("" + System.currentTimeMillis())
//                .build();
//        simpMessagingTemplate.convertAndSendToUser(userId, "/queue/privateMessage/" + room, response);
//    }
//}
