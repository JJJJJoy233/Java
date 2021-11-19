package quiz5;

import java.util.Scanner;

public class quiz5_29{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y = input.nextInt(),w = input.nextInt();
		String m[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		String d[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] nl = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] il = {31,29,31,30,31,30,31,31,30,31,30,31};
		if(y%400==0||y%4==0&&y%100!=0) {
			for(int i=1;i<=12;i++) {
				System.out.printf("\t\t\t%s%d\t\t\t\t\n",m[i-1],y);
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
				int count=0;
				for(int j =0;j<il[i-1];j++) {
					int mw = (w+j)%7;
					if(j==0)switch (mw) {
					case 0:System.out.print(j+1+"\t");count=mw+1;break;
					case 1:System.out.print("\t"+(j+1)+"\t");count=mw+1;break;
					case 2:System.out.print("\t\t"+(j+1)+"\t");count=mw+1;break;
					case 3:System.out.print("\t\t\t"+(j+1)+"\t");count=mw+1;break;
					case 4:System.out.print("\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
					case 5:System.out.print("\t\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
					case 6:System.out.print("\t\t\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
					}
					else {
						System.out.print((j+1)+"\t");count++;
						if(j==il[i-1]-1)w=mw+1;
					}
					if(count==7) {
						System.out.print("\n");count=0;
					}
				}
				System.out.print("\n");
				
			}
		}
		else {
			for(int i=1;i<=12;i++) {
					System.out.printf("\t\t\t%s%d\t\t\t\t\n",m[i-1],y);
					System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
					System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
					int count=0;
					for(int j =0;j<nl[i-1];j++) {
						int mw = (w+j)%7;
						if(j==0)switch (mw) {
						case 0:System.out.print(j+1+"\t");count=mw+1;break;
						case 1:System.out.print("\t"+(j+1)+"\t");count=mw+1;break;
						case 2:System.out.print("\t\t"+(j+1)+"\t");count=mw+1;break;
						case 3:System.out.print("\t\t\t"+(j+1)+"\t");count=mw+1;break;
						case 4:System.out.print("\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
						case 5:System.out.print("\t\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
						case 6:System.out.print("\t\t\t\t\t\t"+(j+1)+"\t");count=mw+1;break;
						}
						else {
							System.out.print((j+1)+"\t");count++;
							if(j==nl[i-1]-1)w=mw+1;
						}
						if(count==7) {
							System.out.print("\n");count=0;
						}
					}
					System.out.print("\n");
				
			}
		}
	}
}