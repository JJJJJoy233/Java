package Quiz5;

public class quiz5_26 {
	public static void main(String[] args) {
		for(double i=10000;i<100001;i+=10000) {
			double ei=1,item=1;
			for(double j=1;j<=i;j++) {
				item*=1.0/j;
				ei+=item;
			}
			System.out.println(ei);
		}
	}
}
