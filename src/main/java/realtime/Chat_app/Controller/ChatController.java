package realtime.Chat_app.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.Payload;
import realtime.Chat_app.model.ChatMessage;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Matches the frontend's "/app/sendMessage"
    @SendTo("/topic/messages") // Sends messages to all clients subscribed to "/topic/messages"
    public ChatMessage sendMessage(@Payload ChatMessage message) {
        return message;
    }
}
