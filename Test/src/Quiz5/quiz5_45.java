package Quiz5;
import java.util.Scanner;
public class quiz5_45 {
	public static void main(String[] args) {
		System.out.print("Ener 10 numbers: ");
		Scanner input = new Scanner(System.in);
		double sum=0,sssum=0;
		for(int i =0;i<10;i++) {
			double a = input.nextDouble();
			sum+=a;
			sssum+=a*a;
		}
		double ave = sum/10,sd = Math.sqrt((sssum-(sum*sum/10))/9);
		System.out.print("The mean is "+ave+"\nThe standard deviation is "+sd);
	}
}
