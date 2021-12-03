package quiz11;
import java.util.Scanner;
import java.util.ArrayList;
public class Quiz11_16 {
	public static void main(String[] args) {
		int number1= (int)(Math.random()*10);
		int number2= (int)(Math.random()*10);
		ArrayList<Integer> A = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer = input.nextInt();
		while(number1+number2 != answer) {
			if(A.contains(answer)) {
				System.out.println("You have already entered "+answer);
			}
			else {
				System.out.println("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			}
			A.add(answer);
			answer = input.nextInt();
		}
		System.out.println("You got it!");
		
	}
}
