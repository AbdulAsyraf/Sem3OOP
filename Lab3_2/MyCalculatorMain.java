import java.util.ArrayList;

public class MyCalculatorMain{
    
    public static void main(String [] args){
        Calculator kulat = new Calculator();
        ArrayList<Float> values = new ArrayList<Float>();
        values.add(2.33f);
        values.add(4.55f);
        values.add(5.66f);
        values.add(7.88f);

        System.out.println("The maximum value of the set is " + kulat.getMax(values));
        System.out.println("The minimum value of the set is " + kulat.getMin(values));
        System.out.println("The average value of the set is " + kulat.getAverage(values));
        System.out.println("The sum of values of the set is " + kulat.getSum(values));
    }
}