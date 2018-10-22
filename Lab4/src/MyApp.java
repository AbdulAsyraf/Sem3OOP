public class MyApp{
    public static void main (String [] args){
        Car carObj = new Car (4, 4, 4);
        ConvertibleCar myconvertibleCar = new ConvertibleCar(carObj);
        Car mycar = myconvertibleCar.getCar();

        int tire = mycar.getNo_tire();
        System.out.println("No of Tire : "+tire);

        int door = mycar.getNo_door();
        System.out.println("No of Door : "+door);

        int mirror = mycar.getNo_mirror();
        System.out.println("No of Mirror : "+mirror);

        myconvertibleCar.carInformation();

        PremiumCar premiumCar = new PremiumCar("Proton Saga", 4, 4);
        premiumCar.carInformation();
        String brand = premiumCar.getBrand();
        System.out.println("Brand of Car : " + brand);
        System.out.println("Size of tire : " + premiumCar.getSize_tire());
        System.out.println("Number of tire : " + premiumCar.getNo_tire());
    }
}