public class Biodata{
	private String no_id;
	private String name;
	private Address home_Address;
	
	public Biodata(){}
	
	public void setNo_id(String no_id){
		this.no_id = no_id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setHome_address(Address address){
		this.home_Address = address;
	}
	
	public String getNo_id(){
		return no_id;
	}
	
	public String getName(){
		return name;
	}
	
	public Address getHome_address(){
		return home_Address;
	}
}