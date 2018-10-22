import java.util.Random;

public class MyCalculator{
    
    public int [] generateRandomData(){
        int inputData[] = new int[10];

        Random generateRandom = new Random();
        for (int i = 0; i < 10; i++){
            inputData[i] = generateRandom.nextInt(100);
        }
        return inputData;
    }

    public int getMaxValue(int[] inputData){
        int max = 0;
        for (int i = 0; i < inputData.length; i++){
            if (i == 0){
                max = inputData[i];
            }
            else{
                if (inputData[i] > max){
                    max = inputData[i];
                }
            }
        }

        return max;
    }

    public int getMinValue(int[] inputData){
        int min = 0;
        for (int i = 0; i < inputData.length; i++){
            if (i == 0){
                min = inputData[i];
            }
            else{
                if (inputData[i] < min){
                    min = inputData[i];
                }
            }
        }

        return min;
    }

    public int getSumValue(int[] inputData){
        int sum = 0;
        for (int i = 0; i < inputData.length; i++){
            sum = sum + inputData[i];
        }

        return sum;
    }

    public float getAverageValue(int sum, int num){
        float ave = 0f;
        ave = sum / num;

        return ave;
    }
}