package quiz5;

public class quiz5_32 {
	public static void main(String[] args) {
		int a=0,b=0;
		while(a==b) {
			a = (int)(10*Math.random());
			b = (int)(10*Math.random());
		}
		System.out.println(10*a+b);
	}
}
