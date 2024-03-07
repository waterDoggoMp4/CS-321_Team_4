
import java.util.ArrayList;

public class ProfessionalUser extends User{
  private String affiliation;
  private 

  public ProfessionalUser(String name, int uid, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
    super(name, uid, bio, longitude, latitude, blockedUsers);
  }

}
