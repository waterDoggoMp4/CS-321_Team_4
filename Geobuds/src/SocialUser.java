import java.util.ArrayList;

public class SocialUser extends User{
  private ArrayList<SocialUser> friendsList;

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
