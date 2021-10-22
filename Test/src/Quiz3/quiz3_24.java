package Quiz3;
public class quiz3_24 {
	public static void main(String[] args) {
		String str[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String st[] = {"Clubs","Diamonds","Hearts","Spades"};
		int num1,num2;
		num1 = (int)(13*Math.random());
		num2 = (int)(4*Math.random());
		System.out.println("The card you picked is "+str[num1]+" of "+st[num2]);
	}
}
