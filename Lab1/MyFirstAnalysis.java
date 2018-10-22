import java.util.Random;

public class MyFirstAnalysis{
	public int [] generateRandomData(){
		int inputData[] = new int[10];
		
		Random generateRandom = new Random();
		for (int i = 0; i < 10; i++){
			inputData[i] = generateRandom.nextInt(100);
		}
	
		return inputData;
	}
	
	public void findMaxMinSumAverage(int [] inputData){
		int max, min, sum, ave;
		sum = 0;
		ave = 0;
		min = 0;
		max = 0;
		for (int j = 0; j < 10; j++){
			if (j == 0 ){
				min = inputData[j];
				max = inputData[j];
			}
			else{
				if (inputData[j] < min)
					min = inputData[j];
				if (inputData[j] > max)
					max = inputData[j];
			}
			sum = sum + inputData[j];
		}
		ave = sum / 10;
		
		System.out.println("Minimum value is "+min);
		System.out.println("Maximum value is "+max);
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+ave);
	}
	
	public static void main(String[] args){
		MyFirstAnalysis firstAnalysis = new MyFirstAnalysis();
		for (int value : firstAnalysis.generateRandomData()){
			System.out.println("Values : "+value);
		}
	}
}