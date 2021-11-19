package quiz3;

import java.util.Scanner;
public class quiz3_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(),y=input.nextInt();
		if(x>0 && y>0 && (0.5*x+y-100)<0) System.out.print("in!");
	}
}
