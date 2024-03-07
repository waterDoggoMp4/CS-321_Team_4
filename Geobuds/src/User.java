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

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

=======
>>>>>>> 08e6345 (first commit)
    public int getUid() {
        return uid;
    }

    public String[] getBio() {
        return bio;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 08e6345 (first commit)
    public double getLongitude() {
        return longitude;
    }

<<<<<<< HEAD
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

=======
>>>>>>> 08e6345 (first commit)
    public double getLatitude() {
        return latitude;
    }

<<<<<<< HEAD
=======
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

>>>>>>> 08e6345 (first commit)
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

<<<<<<< HEAD
    public Object[] getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(Object[] blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

=======
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


>>>>>>> 08e6345 (first commit)
}
