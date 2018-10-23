import java.util.ArrayList;
import java.lang.Math;

public class Calculator{
    public float getMax(ArrayList<Float> data){
        float max = data.get(0);
        for (float i : data){
            max = Math.max(max, i);
        }
        return max;
    }

    public float getMin(ArrayList<Float> data){
        float min = data.get(0);
        for (float i : data){
            min = Math.min(min, i);
        }
        return min;
    }

    public float getAverage(ArrayList<Float> data){
        float sum = 0;
        float ave = 0;
        for (float i : data){
            sum = sum + i;
        }
        ave = sum / data.size();
        return ave;
    }
    
    public float getSum(ArrayList<Float> data){
        float sum = 0;
        for (float i : data){
            sum = sum + i;
        }
        return sum;
    }
}