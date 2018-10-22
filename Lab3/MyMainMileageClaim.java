public class MyMainMileageClaim{
	public static void main(String [] args){
		MileageCalculator small = new MileageCalculator(1000.0, 500.0);
		MileageCalculator big = new MileageCalculator(2000.0, 700.0);
		
		System.out.println("Total claim is RM :" + small.calcMileageBelow1500cc());
		System.out.println("Total claim is RM :" + big.calcMileageAbove1500cc());
	}
}