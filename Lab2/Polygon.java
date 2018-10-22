public class Polygon{
	public static void main (String [] args){
		RegularPolygon shape1 = new RegularPolygon(6,4);
		RegularPolygon shape2 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Perimeter of shape 1: "+shape1.getPerimeter());
		System.out.println("Area of shape 1: "+shape1.getArea());
		System.out.println("Perimeter of shape 2: "+shape2.getPerimeter());
		System.out.println("Area of shape 2; "+shape2.getArea());
	}
}
