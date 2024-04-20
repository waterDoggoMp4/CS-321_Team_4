import java.time.LocalDateTime;

/**
 * Message class
 */
public class Message {
    private int messageId;
    private String message;
    private LocalDateTime timestamp;

    public Message(int mid, String message) {
        this.messageId = mid;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * @return the messageId
     */
    public int getMessageId() {
        return messageId;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        if(message.length <= 250){
            this.message = message;
        }
        else{
            this.message = message.substring(0,250);
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}
