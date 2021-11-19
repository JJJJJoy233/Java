package quiz5;

public class quiz5_27 {
	public static void main(String[] args) {
		int count=0;
		for(int i =101;i<=2100;i++) {
			if(i%400==0||i%4==0&&i%100!=0) {
				System.out.printf("%5d",i);
				count++;
				if(count%10==0)System.out.print("\n");
			}
		}
		System.out.println("\n Count: "+count);
	}
}
