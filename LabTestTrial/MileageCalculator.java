public class MileageCalculator{
	private double typeEngine;
	private double distance;
	
	public MileageCalculator(double typeEngine, double distance){
		this.typeEngine = typeEngine;
		this.distance = distance;
	}
	
	public double calcMileageBelow1500cc(){
		if (distance <= 500.0)
			return 0.60;
		else
			return 0.65;
	}
	
	public double calcMileageAbove1500cc(){
		if (distance <= 500.0)
			return 0.80;
		else
			return 0.85;
	}
	
	public double calcClaim(double distance){
		double claim = 0.0;
		if (typeEngine < 1500){
			claim = distance * calcMileageBelow1500cc();
		}
		else{
			claim = distance * calcMileageAbove1500cc();
		}
		return claim;
	}
	
	
}