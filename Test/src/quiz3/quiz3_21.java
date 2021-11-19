package quiz3;

import java.util.Scanner;
public class quiz3_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y,m,d;
		y = input.nextInt();
		m = input.nextInt();
		d = input.nextInt();
		int mo=m;
		if (m==1||m==2) {mo+=2; y-=1;}
		int j=y/100, k=y%100;
		int h = (d+26*(mo+1)/10+k+k/4+j/4+5*j)%7;
		switch (h){
		case 0:System.out.println("Saturday!");break;
		case 1:System.out.println("Sunday!");break;
		case 2:System.out.println("Monday!");break;
		case 3:System.out.println("Tuesday!");break;
		case 4:System.out.println("Wendesday!");break;
		case 5:System.out.println("Tursday!");break;
		case 6:System.out.println("Friday!");break;
		}
	}
}
