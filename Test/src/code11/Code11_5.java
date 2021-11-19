package code11;

public class Code11_5 {
	public static void main(String[] args) {
		displayObject(new Code11_2(1,"red",false));
		displayObject(new Code11_3(1,1,"black",true));
	}
	
	public static void displayObject(Code11_1 object) {
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}
