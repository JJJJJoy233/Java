package quiz3;

import java.util.Scanner;
public class quiz3_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x1=input.nextFloat(),y1=input.nextFloat(),w1=input.nextFloat(),h1=input.nextFloat();
		float x2=input.nextFloat(),y2=input.nextFloat(),w2 = input.nextFloat(),h2 = input.nextFloat();
		float X[] = {x2+w2/2,x2-w2/2},Y[]={y2+h2/2,y2-h2/2};
		int flag=0;
		for(int i=0;i<2;i++) {
			boolean a = X[i]>=(x1-w1/2)&&X[i]<=(x1+w1/2);
			for(int j=0;j<2;j++) {
				boolean b = Y[j]>=(y1-h1/2)&&Y[j]<=(y1+h1/2);
				if(a&&b)flag+=1;
			}
		}
		if(flag==0)System.out.print("out");
		else if (flag==4)System.out.print("in");
		else System.out.print("overlap");

	}
}
