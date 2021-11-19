package quiz7;
import java.util.Scanner;
public class quiz7_3 {
	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int a = input.nextInt();
		while(a!=0) {
			array[a-1]+=1;
			a = input.nextInt();
		}
		for(int val=0;val<100;val++) {
			if(array[val]>1) {
				System.out.println((val+1)+" occurs "+array[val]+" times");
			}
			else if(array[val]==1) {
				System.out.println((val+1)+" occurs "+array[val]+" time");	
			}
		}
	}
}
