package quiz9;
import java.util.Date;
public class Quiz9_3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] agrs) {
		Date date = new Date();
		long[] time = {10000,100000,1000000,10000000,100000000,10000000000l,10000000000l,100000000000l};
		for(int i =0;i<8;i++) {
			date.setTime(time[i]);
			System.out.println(date.getTime());
			System.out.println(date.toString());
		}
	}
}
