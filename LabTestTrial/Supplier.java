public class Supplier{
	private String supplierName;
	private Address address;// = new Address(NULL, NULL, NULL, NULL, NULL, NULL);
	
	public Supplier(){}
	
	public String getSupplierName(){
		return supplierName;
	}
	
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
}