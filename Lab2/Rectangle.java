public class Rectangle{
	private float height;
	private float width;
	
	public Rectangle(){
		this.height = 1;
		this.width = 1;
	}
	
	public Rectangle(float height, float width){
		this.height = height;
		this.width = width;
	}
	
	public float getArea(){
		float area = 0;
		area = height * width;
		return area;
	}
	
	public float getPerimeter(){
		float perimeter = 0;
		perimeter = 2 * (height + width);
		return perimeter;
	}
}