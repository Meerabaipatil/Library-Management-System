package LMS;

public class User {
	private int userId;
	private String name;
	
	public int getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	
	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}
	
	
	

}
