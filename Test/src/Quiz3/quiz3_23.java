package Quiz3;

import java.util.Scanner;
public class quiz3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		x= input.nextInt();
		y= input.nextInt();
		if(x<5&&x>-5&&y<2.5&&y>-2.5)System.out.println("in");
		else System.out.println("out!");
	}
}
