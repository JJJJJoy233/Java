package Quiz5;
import java.util.Scanner;
public class quiz5_17 {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i =1;i<=n;i++) {
			int k=n;
			for(int j=1;j<i+n;j++) {
				if(j<n) {
					if(k<=i)System.out.print(k+" ");
					else System.out.print("  ");
					k--;
				}
				else {
					System.out.print(k+" ");k++;
				}
			}
			System.out.println();
		}
	}
}