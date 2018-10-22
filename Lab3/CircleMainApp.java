public class CircleMainApp{
	public static void main (String[] args) {
		CircleCalculator circle = new CircleCalculator(2);
		System.out.println("Diameter	: "+circle.calcDiameterOfCircle());
		System.out.println("Area		: "+circle.calcAreaOfCircle());
		System.out.println("Circumference	: "+circle.calcCircumferenceOfCircle());
		System.out.println("Area of Sector	: "+circle.calcAreaOfSector(30));
	}
}
