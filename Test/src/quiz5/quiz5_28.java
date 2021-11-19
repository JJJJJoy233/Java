package quiz5;
import java.util.Scanner;
public class quiz5_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y = input.nextInt(),w = input.nextInt();
		String m[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String d[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] nl = {0,31,59,90,120,151,181,212,243,273,304,334};
		int[] il = {0,31,60,91,121,152,182,213,244,274,305,335};
		if(y%400==0||y%4==0&&y%100!=0) {
			for(int i=1;i<=12;i++) {
				int mw = (w+il[i-1]-1)%7;System.out.printf("%s 1, %d is %s\n",m[i-1],y,d[mw]);
			}
		}
		else {
			for(int i=1;i<=12;i++) {
				int mw = (w+nl[i-1])%7;System.out.printf("%s 1, %d is %s\n",m[i-1],y,d[mw]);
			}
		}
	}
}
