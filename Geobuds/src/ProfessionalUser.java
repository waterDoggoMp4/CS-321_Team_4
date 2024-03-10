import java.util.ArrayList;

/**
 * ProfessionalUser class
 */
public class ProfessionalUser extends User{
  private String affiliation;
  private boolean advertised;


  /**
   * Constructor for ProfessionalUser
   * @param name full name of the user
   * @param uid unique id of the user
   * @param password password of the user
   * @param bio bio of the user
   * @param longitude longitude of the user
   * @param latitude latitude of the user
   * @param blockedUsers list of blocked users
   */
  public ProfessionalUser(String name, int uid, String password, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
    super(name, uid, password, bio, longitude, latitude, blockedUsers);
    this.affiliation = "";
  }

  /**
   * figuring out how to advertise
   */
  private void advertise(){
      advertised = true;
  }

}
