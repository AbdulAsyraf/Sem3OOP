public class MyApp{
    public static void main (String[] args){
        MyCalculator calculator = new MyCalculator();
        int [] inputData = calculator.generateRandomData();
        System.out.println("The generated values are : ");
        for (int value : inputData)
            System.out.print(value+", ");
        System.out.println();

        System.out.println("Max Value : "+calculator.getMaxValue(inputData));
        System.out.println("Min Value : "+calculator.getMinValue(inputData));
        System.out.println("Sum Value : "+calculator.getSumValue(inputData));
        System.out.println("Avg Value : "+calculator.getAverageValue(calculator.getSumValue(inputData), inputData.length));
    }
}