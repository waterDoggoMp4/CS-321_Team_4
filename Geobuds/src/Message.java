import java.time.LocalDateTime;

public class Message {
    private int messageId;
    private String message;
    private LocalDateTime timestamp;

    public Message(int mid, String message) {
        this.messageId = mid;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
