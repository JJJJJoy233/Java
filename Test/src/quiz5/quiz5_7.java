package quiz5;

public class quiz5_7 {
	public static void main(String[] args) {
		float total=0,tuition=10000;
		for(int i=0;i<10;i++) {
			if(i<4) total+=tuition;
			tuition*=1.05;
		}
		System.out.println("total is "+total);
		System.out.println("tuition is "+tuition);
	}
}
