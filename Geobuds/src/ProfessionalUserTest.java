import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class ProfessionalUserTest {

    @Test
    public void test_professionalUserConstructor(){
        ProfessionalUser professionalUser = new ProfessionalUser("name", 1, "", new String[]{"bio"}, 0.0, 0.0, new ArrayList<>());
        assertEquals(1, professionalUser.getUid());
        assertEquals(professionalUser.getName(), "name");
        assertArrayEquals(new String[]{"bio"}, professionalUser.getBio());
        assertEquals(0.0, professionalUser.getLatitude(), 0.0);
        assertEquals(0.0, professionalUser.getLongitude(), 0.0);
    }
}
