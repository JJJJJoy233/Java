package code9;

public class Code9_8 {
	private double radius = 1;
	private static int numberOfObjects = 0;
	public Code9_8(){
		numberOfObjects++;
	}
	
	public Code9_8(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >=0)?newRadius:0;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}