package code11;

public class Code11_4 {
	public static void main(String[] args) {
		Code11_2 circle = new Code11_2(1);
		System.out.println("A circle "+ circle.toString());
		System.out.println("The color is "+ circle.getColor());
		System.out.println("The radius is "+ circle.getRadius());
		System.out.println("The area is "+ circle.getArea());
		System.out.println("The diameter is "+ circle.getDiameter());
		
		Code11_3 rectangle = new Code11_3(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}
}
