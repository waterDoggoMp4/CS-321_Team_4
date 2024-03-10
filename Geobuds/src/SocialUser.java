import java.util.ArrayList;

/**
 * SocialUser class
 */
public class SocialUser extends User{
  private ArrayList<SocialUser> friendsList;

    /**
     * Constructor for SocialUser
     * @param name full name of the user
     * @param uid unique id of the user
     * @param password password of the user
     * @param bio bio of the user
     * @param longitude longitude of the user
     * @param latitude latitude of the user
     * @param blockedUsers list of blocked users
     */
  public SocialUser(String name, int uid, String password,  String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
    super(name, uid, password, bio, longitude, latitude, blockedUsers);
    this.friendsList = new ArrayList<SocialUser>();
  }

  /**
   *
   * @param user friend to be added
   * @return true if the user was added to the friends list
   */
  public boolean addFriend(SocialUser user){
    if(user == null) {
      return false;
    }
    friendsList.add(user);
    return true;
  }

  /**
   *
   * @param user friend to be removed
   * @return true if the user was removed from the friends list
   */
  public boolean removeFriend(SocialUser user){
    if(user == null) {
      return false;
    }
    friendsList.remove(user);
    return true;
  }

  /**
   *
   * @param userID id of the friend to be retrieved
   * @return User object of the friend
   */
  public User getFriend(int userID){
    for(SocialUser user : friendsList){
      if(user.getUid() == userID){
        return user;
      }
    }
    return null;
  }
}
