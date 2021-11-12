package quiz9;
import java.util.GregorianCalendar;
public class Quiz9_5 {
	public static void main(String[] args) {
		GregorianCalendar GC = new GregorianCalendar();
		int Y =GC.get(GC.YEAR);
		int M =GC.get(GC.MONTH);
		int D =GC.get(GC.DAY_OF_MONTH);
		System.out.printf("%d-%d-%d\n",Y,M,D);
		GC.setTimeInMillis(1234567898765L);
		Y =GC.get(GC.YEAR);
		M =GC.get(GC.MONTH);
		D =GC.get(GC.DAY_OF_MONTH);
		System.out.printf("%d-%d-%d",Y,M,D);
	}
}
