public class PremiumCar extends Car{
    private int size_tire;
    private String brand;

    public PremiumCar(){
        super();
    }

    public PremiumCar(int no_tire, int size_tire){
        super(no_tire);
        this.size_tire = size_tire;
    }

    public PremiumCar(String brand, int no_tire, int no_door){
        super(no_tire, no_door);
        this.brand = brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setSize_tire(int size_tire){
        this.size_tire = size_tire;
    }

    public String getBrand(){
        return brand;
    }

    public int getSize_tire(){
        return size_tire;
    }
}