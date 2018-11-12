public class MyMainMileageClaim{
	public static void main(String [] args){
		MileageCalculator mc1 = new MileageCalculator(1000.0, 500.0);
		MileageCalculator mc2 = new MileageCalculator(2000.0, 700.0);
		
		System.out.println("Total claim is RM " + mc1.calcClaim(500.0));
		System.out.println("Total claim is RM " + mc2.calcClaim(700.0));
	}
}