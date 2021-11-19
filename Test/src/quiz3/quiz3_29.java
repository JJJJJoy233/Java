package quiz3;

import java.util.Scanner;
public class quiz3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x1= input.nextFloat(),y1=input.nextFloat(),r1=input.nextFloat();
		float x2= input.nextFloat(),y2=input.nextFloat(),r2=input.nextFloat();
		float d1= (float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		float d2 = Math.abs(r1-r2),d3 =r1+r2;
		if (d1<=d2)System.out.println("in");
		else if(d1<=r1+r2) System.out.println("overlap");
		else System.out.println("out");
	}
}
