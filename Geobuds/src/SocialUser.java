import java.util.ArrayList;

public class SocialUser extends User{
  private ArrayList<SocialUser> friendsList;

  public SocialUser(String name, int uid, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
    super(name, uid, bio, longitude, latitude, blockedUsers);
  }

  /**
   * REQUIRES: user != null
   *
   * @param user friend to be added
   * @return true if the user was added to the friends list
   */
  private boolean addFriend(SocialUser user){
    if(user == null) {
      return false;
    }
    friendsList.add(user);
    return true;
  }

  /**
   * REQUIRES: user != null
   *
   * @param user friend to be removed
   * @return true if the user was removed from the friends list
   */
  private boolean removeFriend(SocialUser user){
    if(user == null) {
      return false;
    }
    friendsList.remove(user);
    return true;
  }

  /**
   * REQUIRES: userID > 0
   *
   * @param userID id of the friend to be retrieved
   * @return User object of the friend
   */
  private User getFriend(int userID){
    for(SocialUser user : friendsList){
      if(user.getUid() == userID){
        return user;
      }
    }
    return null;
  }
}
