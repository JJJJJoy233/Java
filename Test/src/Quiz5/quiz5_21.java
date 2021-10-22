package Quiz5;
import java.util.Scanner;
public class quiz5_21 {
	public static void main(String[] args) {
		System.out.print("Loan Amount: ");
		Scanner input= new Scanner(System.in);
		float loan=input.nextFloat();
		System.out.print("Number Of Years: ");
		Scanner input1 = new Scanner(System.in);
		int year=input.nextInt();
		System.out.println("Interest Rate"+"     "+"Monthly Payment"+"     "+"Total Payment");
		for(double i=5.000;i<=8.000;i+=0.125) {
			double j=i/1200,mpay;
			mpay = (loan*j)/(1-(1/(Math.pow(1+j,year*12))));
			System.out.print(i+"%    ");
			System.out.print(mpay+"    ");
			System.out.println(year*12*mpay);
		}
		
		
	}
}
