import java.util.ArrayList;

public class SocialUser extends User{
  private ArrayList<SocialUser> friendsList;

  public SocialUser(String name, int uid, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
    super(name, uid, bio, longitude, latitude, blockedUsers);
  }

  private boolean addFriend(SocialUser user){
    return true;
  }

  private boolean removeFriend(SocialUser user){
    return true;
  }

  private User getFriend(int userID){
    return null;
  }
}
