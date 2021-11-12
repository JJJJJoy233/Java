package quiz9;
import java.util.Scanner;
public class Quiz9_13 {
	public static void main(String[] args) {
		double[][] array = new double[10][10];
		System.out.println("Enter the number of rows and column in the array: ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println("Enter the array: ");
		Scanner input1 = new Scanner(System.in);
		Location maxP = new Location();
		for(int i=0;i<m;i++) {
			for (int j =0;j<n;j++) {
				array[i][j] = input.nextDouble();
				if(array[i][j]>maxP.maxValue) {
					maxP.row = i;
					maxP.column = j;
					maxP.maxValue = array[i][j];
				}
			}
		}
		System.out.printf("The location of the largest element is %f at (%d, %d)",maxP.maxValue,maxP.row,maxP.column);
	}
}

class Location{
	public int row;
	public int column;
	public double maxValue = -1;
	public Location(){
	}
}

