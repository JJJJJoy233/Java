package quiz7;
import java.util.Scanner;
public class quiz7_5 {
	public static void main(String[] args) {
		System.out.print("Enter 10 numbers: ");
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		int count=0;
		for(int i=0;i<9;i++) {
			int j;
			int a = input.nextInt();
			for(j = 0;j<9;j++) {
				if(a==array[j])
					break;
			}
			if(j==9) {array[count] = a;count+=1;}
		}
		System.out.println("The number of distinct numbers is "+count);
		System.out.print("The distinct numbers are:");
		for(int i =0;i<count;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
