package Quiz3;

import java.util.Scanner;
public class quiz3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		x= input.nextInt();
		y= input.nextInt();
		if (x*x+y*y<100)System.out.println("in!");
		else System.out.println("out!");
	}
}
