package code9;
import java.util.Scanner;
public class Code9_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point1's x-,y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point2's x-,y-coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is "+ p1.distance(p2));
		System.out.println("The midpoint between p1 and p2 is "+ p1.midpoint(p2).toString());
		
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
