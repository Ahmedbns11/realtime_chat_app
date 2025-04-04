package realtime.Chat_app.model;


public class ChatMessage {
    private Long id;
    private String content;
    private String sender;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ChatMessage(String content, Long id, String sender) {
        this.content = content;
        this.id = id;
        this.sender = sender;
    }
}
