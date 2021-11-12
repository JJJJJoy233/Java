package quiz9;
import java.util.Random;
public class Quiz9_4 {
	public static void main(String[] agrs) {
		Random rdobj = new Random(1000);
		for(int i =0;i<50;i++) {
			System.out.println(rdobj.nextInt(100));
		}
	}
}