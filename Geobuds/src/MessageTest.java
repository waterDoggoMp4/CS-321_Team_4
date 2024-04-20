import static org.junit.Assert.*;
import org.junit.Test;
public class MessageTest {

    @Test
    public void test_messageConstructor() {
        Message message = new Message(1, "message");
        assertEquals(1, message.getMessageId());
        assertEquals(message.getMessage(), "message");
        assertNotNull(message.getTimestamp());
    }
}
