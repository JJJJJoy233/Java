package Quiz5;
import java.util.Scanner;
public class quiz5_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] y= new int[100];
		int count=0;
		while(n!=0) {
			y[count] = n%8;
			n/=8;
			count++;
		}
		for(count=count-1;count>=0;count--) {
			System.out.print(y[count]);
		}
	}
}
