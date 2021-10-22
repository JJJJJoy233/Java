package Quiz3;

import java.util.Scanner;
public class quiz3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		a= input.nextInt();
		b = input.nextInt();
		c= input.nextInt();
		if (a+b>c||a+c>b||b+c>a) {
			System.out.println(a+b+c);
		}
		else {
			System.out.println("illegal input!");
			return;
		}
	}
}
