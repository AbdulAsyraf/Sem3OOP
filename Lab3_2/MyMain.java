import java.lang.Math;
import java.util.Scanner;

public class MyMain{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value 1: ");
        float a = sc.nextFloat();
        System.out.print("Please enter value 2: ");
        float b = sc.nextFloat();
        sc.close();
        float maxx = Math.max(a, b);
        System.out.println("\nThe larger value between " + a + " and " + b + " is " + maxx);
    }
}