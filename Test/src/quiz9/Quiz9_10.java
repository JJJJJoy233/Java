package quiz9;
import java.util.Scanner;
public class Quiz9_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuadraticEquation QE = new QuadraticEquation(input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(QE.getDiscriminant()>0) {
			System.out.println(QE.getRoot1());
			System.out.println(QE.getRoot2());
		}
		else if(QE.getDiscriminant()==0) {
			System.out.println(QE.getRoot1());
		}
		else
			System.out.println("The equation has no roots");
	}
}

class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getDiscriminant() {
		return this.b*this.b-4*this.a*this.c;
	}
	public double getRoot1() {
		if(this.getDiscriminant()<0)
			return 0;
		else
			return (-this.b+Math.sqrt(this.getDiscriminant()))/2*this.a;
	}
	public double getRoot2() {
		if(this.getDiscriminant()<0)
			return 0;
		else
			return (-this.b-Math.sqrt(this.getDiscriminant()))/2*this.a;
	}
}