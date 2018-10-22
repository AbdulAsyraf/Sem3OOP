public class Address{
	private int noShop;
	private String road;
	private String district;
	private int poscode;
	private String state;
	private int phone;
	
	public Address(int noShop, String road, String district, int poscode, String state, int phone){
		this.noShop = noShop;
		this.road = road;
		this.district = district;
		this.poscode = poscode;
		this.state = state;
		this.phone = phone;
	}
	
	public int getNoShop(){
		return noShop;
	}
	
	public String getRoad(){
		return road;
	}
	
	public String getDistrict(){
		return district;
	}
	
	public int getPoscode(){
		return poscode;
	}
	
	public String getState(){
		return state;
	}
	
	public int getPhone(){
		return phone;
	}
}