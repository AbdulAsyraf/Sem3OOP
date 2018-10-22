public class MyMain{
	public static void main (String [] args){
		Rectangle petak1 = new Rectangle(40, 4);
		Rectangle petak2 = new Rectangle(35.9f, 3.5f);

		System.out.println("Area of petak1: "+petak1.getArea());
		System.out.println("Perimeter of petak1: "+petak1.getPerimeter());
		System.out.println("Area of petak2: "+petak2.getArea());
		System.out.println("Perimeter of petak2: "+petak2.getPerimeter());
	}
}
