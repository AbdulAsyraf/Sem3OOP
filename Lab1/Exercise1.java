import java.util.Scanner;

public class Exercise1{
    public static void main (String[] args){

        Temperature temperature = new Temperature();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature in Fahrenheit or type -1 to exit:");
        double fahrenheit = input.nextDouble();

        while (fahrenheit != -1){
            double result_temperature = temperature.convertTemperaturetoCelsius(fahrenheit);
            System.out.println("The temperature in celsius is : "+result_temperature);
            System.out.print("Please enter temperature in Fahrenheit or type -1 to exit:");
            fahrenheit = input.nextDouble();
        }
    }
}