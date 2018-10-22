public class Temperature{
    public double convertTemperaturetoCelsius(double fahrenheit){
        double celsius = 0.0;
        
        celsius = (5.0/9)*(fahrenheit-32);
        
        return celsius;
    }
}