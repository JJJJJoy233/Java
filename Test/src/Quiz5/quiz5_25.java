package Quiz5;

public class quiz5_25 {
	public static void main(String[] args) {
		double pii=0;
		for(double i=10000;i<=100000;i+=10000) {
			for(double j =1;j<=i;j++) {
				if(j%2==0)pii-=1/(2*j-1);
				else pii+=1/(2*j-1);
			}
			System.out.println(4*pii);
			pii=0;
		}
	}
}
