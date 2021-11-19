package quiz5;

import java.util.Scanner;

public class quiz5_36 {
	public static void main(String[] args) {

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String cnum = String.valueOf(num);
		int d0=0;
		char rd0='X';
		for(int i =9;i>0;i--) {
			d0+=(num%10)*i;
			num/=10;
		}
		d0%=11;
		System.out.print("The ISBN-10 number is ");
		if(num!=0) {
			if (d0==10) {
				System.out.println(cnum+rd0);
			}
			else {
				System.out.println(cnum+d0);
			}
		}
		else {
			if (d0==10) {
				System.out.println('0'+cnum+rd0);
			}
			else {
				System.out.println('0'+cnum+d0);
			}
		}
	
	}
}