package quiz5;
import java.util.Scanner;
public class quiz5_22 {
	public static void main(String[] args) {
		System.out.println("Loan Amount: ");
		Scanner input = new Scanner(System.in);
		double loan = input.nextDouble();
		System.out.println("Number of Years: ");
		Scanner input1 = new Scanner(System.in);
		double year=input1.nextDouble();
		System.out.println("Annual Interest Rate: ");
		Scanner input2 = new Scanner(System.in);
		double ar = input2.nextDouble(),mr=ar/1200;
		double mpay,tpay;
		mpay = (loan*mr)/(1-(1/(Math.pow(1+mr,year*12))));
		System.out.printf("\nMonthly Payment: %.2f\n",mpay);
		tpay = mpay*year*12;
		System.out.printf("Total Payment: %.2f\n",tpay);
		System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
		for(int i=1;i<=year*12;i++) {
			double interest =mr*loan,principal = mpay-interest;
			loan-=principal;
			if(i==year*12&&loan!=0) {principal +=loan;loan-=loan;}
			System.out.println(i+"\t\t"+interest+"\t\t"+principal+"\t\t"+loan);
		}
	}
}
