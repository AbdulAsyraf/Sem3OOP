public class ConvertibleCar extends Car{
    private Car car;
    public ConvertibleCar(){
        super();
    }

    public ConvertibleCar(Car car){
        super();
        this.car = car;
    }

    public void carInformation(){
        System.out.println("This is Convertible Car");
    }

    public Car getCar(){
        return car;
    }
}