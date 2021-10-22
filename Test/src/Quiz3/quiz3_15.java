package Quiz3;

import java.util.Scanner;
public class quiz3_15{
	public static void main(String[] args) {
		int n = (int)(Math.random()*1000);
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int array[] = new int[3];
		int arra[] = new int [3];
		int flag=0;
 		if (guess == n) {
			System.out.println("you win $30000!");
			return;
		}
		for(int i=0;i<3;i++) {
			array[i] = guess%10;
			arra[i] =n%10;
			guess/=10;
			n/=10;
		}
		if(array[0]>array[1]) {
			int temp=array[0];
			array[0] = array[1];
			array[1] = temp;
		}
		if(array[0]>array[2]) {
			int temp=array[0];
			array[0] = array[2];
			array[2] = temp;
		}if(array[1]>array[2]) {
			int temp=array[1];
			array[1] = array[2];
			array[2] = temp;
		}
		//nsort
		if(arra[0]>arra[1]) {
			int temp=arra[0];
			arra[0] = arra[1];
			arra[1] = temp;
		}
		if(arra[0]>arra[2]) {
			int temp=arra[0];
			arra[0] = arra[2];
			arra[2] = temp;
		}if(arra[1]>arra[2]) {
			int temp=arra[1];
			arra[1] = arra[2];
			arra[2] = temp;
		}
		for(int i=0;i<3;i++) 
			if(arra[i]==array[i]) flag+=1;
		if(flag==3) System.out.println("you win $3000!");
		if(flag==1)System.out.println("you WIN $1000!");
		
		
	}
}
