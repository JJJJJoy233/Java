package code11;

public class Code11_2 extends Code11_1 {
	private double radius;
	
	public Code11_2() {
	}
	
	public Code11_2(double radius) {
		this.radius = radius;
	}
	
	public Code11_2(double radius,String color, boolean filled){
		this .radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public void printCode11_2() {
		System.out.println("The Circle is created "+ getDateCreated()+" and the radius is "+radius);
	}
}
