package code11;

public class Code11_3 extends Code11_1 {
	private double width;
	private double height;
	
	public Code11_3() {	
	}
	
	public Code11_3(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public Code11_3(double width,double height,String color,boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getwidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
}
