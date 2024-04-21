import java.time.LocalDateTime;

/**
 * Message class
 */
public class Message {
    private User sender;
    private User reciever;
    private int messageId;
    private String message;
    private LocalDateTime timestamp;

    /**
     * @param mid the UID for the message
     * @param message the message contents
     * @param sender the message sender
     * @param receiver the message receiver
     */
    public Message(int mid, String message, User sender, User receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageId = mid;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
    
    /**
     * @return the message sender
     */
    public int getSender(){
        return sender;
    }

    /**
     * @param sender the message sender
     */
    public void setSender(User sender){
        this.sender = sender;
    }

    /**
     * @return the message receiver
     */
    public int getReceiver(){
        return receiver;
    }

    /**
     * @param receiver the message receiver
     */
    public void setReceiver(User receiver){
        this.receiver = receiver;
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
