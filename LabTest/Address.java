public class Address{
    private int id;
    private String houseNumber;
    private String street;
    private String district;
    private String state;
    private int postcode;

    public Address(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getHouseNumber(){
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getDistrict(){
        return district;
    }

    public void setDistrict(String district){
        this.district = district;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int getPostcode(){
        return postcode;
    }

    public void setPostcode(int postcode){
        this.postcode = postcode;
    }
}