public class MileageCalculator{
	private double typeEngine;
	private double distance;
	
	public MileageCalculator(double typeEngine, double distance){
		this.typeEngine = typeEngine;
		this.distance = distance;
	}
	
	public double calcMileageBelow1500cc(){
		double claim = 0.0;
		if (distance <= 500.0)
			claim = calcClaim(0.60);
		else
			claim = calcClaim(0.65);
		
		return claim;
	}
	
	public double calcMileageAbove1500cc(){
		double claim = 0.0;
		if (distance <= 500.0)
			claim = calcClaim(0.80);
		else
			claim = calcClaim(0.85);
		
		return claim;
	}
	
	public double calcClaim(double rate){
		double claim;
		claim = distance * rate;
		return claim;
	}
}