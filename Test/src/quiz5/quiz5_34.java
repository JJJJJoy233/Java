package quiz5;
import java.util.Scanner;
public class quiz5_34 {
	public static void main(String[] args) {
		int[] flag = new int[2];
		while(flag[1]<2&&flag[0]<2) {
			int a = (int)(3*Math.random());
			System.out.print("scissor(0),rock(1),paper(2): ");
			Scanner input = new Scanner(System.in);
			int b = input.nextInt();
			if(a==0) {
				switch(b) {
				case 0:System.out.println("The computer is scissor.You are scissor too. It is a draw");break;
				case 1:System.out.println("The computer is scissor.You are rock. You win");flag[1]++;break;
				case 2:System.out.println("The computer is scissor.You are paper. You lose");flag[0]++;break;
				}
			}
			else if(a==1) {
				switch(b) {
				case 0:System.out.println("The computer is rock.You are scissor. You lose");flag[0]++;break;
				case 1:System.out.println("The computer is rock.You are rock too. It is a draw");break;
				case 2:System.out.println("The computer is rock.You are paper. You win");flag[1]++;break;
				}
			}
			else if(a==2) {
				switch(b) {
				case 0:System.out.println("The computer is paper.You are scissor.You win");flag[1]++;break;
				case 1:System.out.println("The computer is paper.You are rock. You lose");flag[0]++;break;
				case 2:System.out.println("The computer is paper.You are paper too. It is a draw");break;
				}
			}
			else {
				System.out.println("Wrong input!");
				return;
			}
		}
		if(flag[1]==2) System.out.println("You win!");
		else System.out.println("You lose!");
	}
}
