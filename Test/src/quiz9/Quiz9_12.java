package quiz9;
import java.util.Scanner;
public class Quiz9_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point2D p1 = new Point2D(input.nextDouble(),input.nextDouble());
		Point2D p2 = new Point2D(input.nextDouble(),input.nextDouble());
		Point2D p3 = new Point2D(input.nextDouble(),input.nextDouble());
		Point2D p4 = new Point2D(input.nextDouble(),input.nextDouble());
		LinearEquation LE = new LinearEquation(p1.getY()-p2.getY(),p2.getX()-p1.getX(),p3.getY()-p4.getY(),p4.getX()-p3.getX(),(p1.getY()-p2.getY())*p1.getX()-(p1.getX()-p2.getX())*p1.getY(),(p3.getY()-p4.getY())*p3.getX()-(p3.getX()-p4.getX())*p3.getY());
		if(!LE.isSolvable())
			System.out.println("No intersection");
		else {
			System.out.printf("(%f, %f)",LE.getX(),LE.getY());
		}
	}
}

class Point2D{
	double x;
	double y;
	Point2D(double newX,double newY){
		this.x = newX;
		this.y = newY;
	}
	double distance(Point2D P){
		return Math.sqrt((this.x-P.x)*(this.x-P.x)+(this.y-P.y)*(this.y-P.y));
	}
	double getX() {
		return this.x;
	}
	double getY() {
		return this.y;
	}
	public Point2D midpoint(Point2D P) {
		Point2D newP = new Point2D((this.x+P.x)/2,(this.y+P.y)/2);
		return newP;
		
	}
	public String toString() {
        return "Point2D [x = " + getX() + ", y = " + getY() + "]";
	}
}