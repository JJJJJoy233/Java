package quiz11;
import java.util.Scanner;
import java.util.ArrayList;
public class quiz11_17 {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(); 
		System.out.println("Enter an integer m:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int mm = m;
		while(!isPrime(m)) {
			int temp = GetminFactor(m);
			if(!A.contains(temp)) {
				A.add(temp);
			}
			else
				A.remove(A.indexOf(temp));
			m /=temp;
		}
		if(!A.contains(m)) {
			A.add(m);
		}
		else
			A.remove(A.indexOf(m));
		
		int n = 1;
		for(Integer i:A) {
			n*=i;
		}
		System.out.println("The smallest number n for m * n to be a perfect square is "+n);
		System.out.print("m * n is "+mm*n);
		
		
	}
	public static int GetminFactor(int n) {
		int temp = (int)Math.sqrt(n);
		for(int i=2;i<=temp;i++) {
			if(n%i==0)
				return i;
		}
		return n;
	}
	public static boolean isPrime(int n) {
		int temp = (int)Math.sqrt(n);
		for (int i =2;i<=temp;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

