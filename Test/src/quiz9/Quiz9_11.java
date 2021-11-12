package quiz9;
import java.util.Scanner;
public class Quiz9_11 {
	public static void main(String[] args) {
		System.out.print("Input 6 double type num please: ");
		Scanner input = new Scanner(System.in);
		LinearEquation LE = new LinearEquation(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(LE.isSolvable()) {
			System.out.println(LE.getX());
			System.out.println(LE.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}
class LinearEquation{
	private double a=0;
	private double b=0;
	private double c=0;
	private double d=0;
	private double e=0;
	private double f=0;
	//set
	public LinearEquation() {
		
	}
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;	
	}
	//get
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	//solve
	public boolean isSolvable() {
		if((this.a*this.d-this.b*this.c)!=0)
			return true;
		else
			return false;
	}
	public double getX() {
		if(this.isSolvable()) {
			return (this.e*this.d - this.b*this.f)/(this.a*this.d-this.b*this.c);
		}
		else {
			return 0;
		}
	}
	public double getY() {
		if(this.isSolvable()) {
			return (this.a*this.f - this.e*this.c)/(this.a*this.d-this.b*this.c);
		}
		else {
			return 0;
		}
	}
}
