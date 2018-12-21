import java.util.Calendar;

public class BuyController{
    private Customer customer;

    public BuyController(Customer customer){
        this.customer = customer;
    }

    public double calcPrice(){
        House house = customer.getHouse();
        String type = house.getType();
        double basePrice = house.getPrice();
        double price = 0;
        if (type == "Bungalow")
            price = basePrice * 1;
        else if (type == "Semi-D")
            price = basePrice * 0.9;
        else if (type == "Terrace")
            price = basePrice * 0.8;
        else if (type == "Apartment")
            price = basePrice * 0.75;
        
        price = price - this.rebatePromotionByMonth() - this.rebateByYear();
        return price;
    }

    public double rebatePromotionByMonth(){
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        if (month == 10){
            return 5000;
        }
        else if (month == 11){
            return 10000;
        }
        else
            return 0;
    }

    public double rebateByYear(){
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        House house = customer.getHouse();
        int houseYear = house.getYear();
        if ((currentYear - houseYear) > 5){
            return 5000;
        }
        else
            return 0;
    }
}