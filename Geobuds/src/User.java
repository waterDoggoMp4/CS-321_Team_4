import java.util.ArrayList;
public class User {
    private String name;
    private int uid;
    private String[] bio;
    private double longitude;
    private double latitude;
    private ArrayList<User> blockedUsers;

    public User(String name, int uid, String[] bio, double longitude, double latitude, ArrayList<User> blockedUsers) {
        this.name = name;
        this.uid = uid;
        this.bio = bio;
        this.longitude = longitude;
        this.latitude = latitude;
        this.blockedUsers = blockedUsers;
    }

    public String getName() {
        return name;
    }

    public int getUid() {
        return uid;
    }

    public String[] getBio() {
        return bio;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public ArrayList<User> getBlockedUsers() {
        return blockedUsers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setBio(String[] bio) {
        this.bio = bio;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setBlockedUsers(ArrayList<User> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    public boolean updateBio(){
        return true;
    }

    public boolean updateName(){
        return true;
    }

    public boolean logIn(){
        return true;
    }

    public boolean logOut(){
        return true;
    }

    public boolean updateProfilePicture(){
        return true;
    }

    public boolean messageUser(){
        return true;
    }

    public boolean receiveMessage(){
        return true;
    }

    public boolean blockUser(){
        return true;
    }

    public boolean unblockUser(){
        return true;
    }

    public boolean post(){
        return true;
    }

    public boolean deletePost(){
        return true;
    }


}