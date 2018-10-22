public class CircleCalculator{
	private double r;
	
	public CircleCalculator(double r){
		this.r = r;
	}
	
	public double calcDiameterOfCircle(){
		double d = 2 * r;
		return d;
	}
	
	public double calcAreaOfCircle(){
		double a = Math.PI * Math.pow(r, 2);
		return a;
	}
	
	public double calcCircumferenceOfCircle(){
		double s = 2 * Math.PI * r;
		return s;
	}
	
	public double calcAreaOfSector(double deg){
		double rad = Math.toRadians(deg);
		double as = 0.5 * rad * Math.pow(r,2);
		return as;
	}
}
