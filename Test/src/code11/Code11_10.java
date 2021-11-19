package code11;
import java.util.ArrayList;

public class Code11_10 {
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(0);
	}
	
	public Object pop() {
		Object o = list.get(0);
		list.remove(0);
		return o;
	}
	
	public void push(Object o) {
		list.add(0,o);
	}
	@Override
	public String toString() {
		return "Stack: "+ list.toString();
	}
}
