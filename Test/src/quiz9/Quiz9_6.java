package quiz9;
import java.util.Date;
import java.util.Random;
public class Quiz9_6 {
	public static void main(String[] args) {
		Random obj = new Random();
		int[] array = new int[100010];
		for(int i =0;i<100;i++) {
			array[i] = obj.nextInt(100);
		}
		StopWatch T = new StopWatch();
		T.start();
		Date date = new Date();
		System.out.println(date.getTime());
		for(int i =0;i<100000;i++) {
			int max = array[i];
			int temp = i; // index
			int tmp; //value
			for(int j=i;j<100000;j++) {
				if(array[j]<max) {
					max = array[j];
					temp =j;
				}
			}
			tmp = array[temp];
			array[temp] = array[i];
			array[i] = tmp;
		}
		T.stop();
		System.out.println(date.getTime());
		System.out.println();
		System.out.println(T.getstartTime());
		System.out.println(T.getendTime());
		System.out.println(T.getElapsedTime());
	}
}
class StopWatch{
	private long  startTime;
	private long endTime;
	Date date = new Date();
	public StopWatch() {
	}
	public long getstartTime() {
		return (long)this.startTime;
	}
	public long getendTime() {
		return (long)this.endTime;
	}
	public void start(){
		this.startTime =date.getTime();
	}
	public void stop() {
		this.endTime = date.getTime();
	}
	public long getElapsedTime() {
		return this.endTime-this.startTime;
	}
}

