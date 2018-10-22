public class CircleCalculator{
	private double r;
	private double d;
	private double s;
	private double a;
	private double aos;

	public CircleCalculator(double r){
		this.r = r;
	}

	public double calcDiameterOfCircle(){
		d = 2 * r;
		return d;
	}

	public double calcAreaOfCircle(){
		a = Math.PI * Math.pow(r, 2);
		return a;
	}

	public double calcCircumferenceOfCircle(){
		s = 2 * Math.PI * r;
		return s;
	}

	public double calcAreaOfSector(double deg){
		//double rad = Math.toRadians(deg);
		double rad = (deg/180) * Math.PI;
		aos = 0.5 * rad * Math.pow(r, 2);
		return aos;
	}
}


