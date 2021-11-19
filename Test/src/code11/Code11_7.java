package code11;

public class Code11_7 {
	public static void main(String[] args) {
		Object object1 = new Code11_2(1);
		Object object2 = new Code11_3(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof Code11_2) {
			System.out.println("The cirlce area is "+((Code11_2)object).getArea());
			System.out.println("The circle diameter is "+((Code11_2)object).getDiameter());
		}
		else if (object instanceof Code11_3) {
			System.out.println("THe rectangle area is "+((Code11_3)object).getArea());
		}
	}
}

