package quiz9;

public class Quiz9_9 {
	public static void main(String[] args) {
		RegularPolygon RP1 = new RegularPolygon();
		System.out.printf("Perimeter is %f, Area is %f\n",RP1.getPerimeter(),RP1.getArea());
		RegularPolygon RP2 = new RegularPolygon(6,4);
		System.out.printf("Perimeter is %f, Area is %f\n",RP2.getPerimeter(),RP2.getArea());
		RegularPolygon RP3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.printf("Perimeter is %f, Area is %f",RP3.getPerimeter(),RP3.getArea());
	}
}
class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	public RegularPolygon() {
	}
	public RegularPolygon(int n,double side) {
		this.n = n;
		this.side = side;
	}
	public RegularPolygon(int n,double side,double x,double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	//get
	public int get_N() {
		return this.n;
	}
	public double get_side() {
		return this.side;
	}
	public double get_X() {
		return this.x;
	}
	public double get_Y() {
		return this.y;
	}
	//set
	public void set_N(int n) {
		this.n = n;
	}
	public void set_side(double side) {
		this.side = side;
	}
	public void set_X(double x) {
		this.side = x;
	}
	public void set_Y(double y) {
		this.side = y;
	}
	public double getPerimeter() {
		return this.n*this.side;
	}
	public double getArea() {
		return (this.n*this.side*this.side)/(4*Math.tan(Math.PI/this.n));
	}
}