
public class Biodata {
	private String no_ID;
	private String name;
	private Address home_Address;
	
	public Biodata() {}
	
	public void setNo_ID(String no_ID) {
		this.no_ID = no_ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHome_Address(Address home_Address) {
		this.home_Address = home_Address;
	}
	
	public String getNo_ID() {
		return no_ID;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getHome_Address() {
		return home_Address;
	}
}
