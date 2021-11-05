package code9;

public class code9_9 {
	public static void main(String[] args) {
		Code9_8 myCircle = new Code9_8(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
		System.out.println("The number of objects created is "+Code9_8.getNumberOfObjects());
		
	}
}
