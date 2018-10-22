import java.util.ArrayList;
public class Facebook {
	private String userID;
	private ArrayList<Friend> friends = new ArrayList<Friend>();
	private Profile profile = new Profile();
	
	public Facebook() {
		
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public Profile getProfile() {
		return profile;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public ArrayList<Friend> getFriends(){
		return friends;
	}

	public void setFriends(ArrayList<Friend> friends){
		this.friends = friends;
	}
}
