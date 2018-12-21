public class Customer{
    private String ic;
    private String name;
    private int hpNumber;
    private Address address;
    private House house;

    public Customer(){}

    public String getIc(){
        return ic;
    }

    public void setIc(String ic){
        this.ic = ic;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public int getHpNumber(){
        return hpNumber;
    }

    public void setHpNumber(int hpNumber){
        this.hpNumber = hpNumber;
    }

    public House getHouse(){
        return house;
    }

    public void setHouse(House house){
        this.house = house;
    }
}