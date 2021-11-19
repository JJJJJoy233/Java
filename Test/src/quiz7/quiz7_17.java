package quiz7;
import java.util.Scanner;
public class quiz7_17 {
	public static void main(String[] args) {
		System.out.print("number name and grade: ");
		Scanner input = new Scanner(System.in);
		int number =input.nextInt();
		int[] score = new int[100];
		String[] name = new String[100];
		for(int i = 0;i<number;i++) {
			score[i] = input.nextInt();
			name[i] = input.next();
		}
		int conumber= number;
		for(int i=0;i<number;number--) {
			for(int j=i;j<number-1;j++) {
				if(score[j]<=score[j+1]) {
					/*int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;*/
					String temps = name[j];
					name[j] = name[j+1];
					name[j+1] = temps;	
				}
			}
		}
		for(int i = 0;i<conumber;i++) {
			System.out.println(name[i]);
		}
	}
}
