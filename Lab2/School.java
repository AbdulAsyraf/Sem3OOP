public class School{
	private String name;
	private Address address;
	
	public School(){}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	public Address getAddress(){
		return address;
	}
}