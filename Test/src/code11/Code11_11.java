package code11;

public class Code11_11 {
	public static void main(String[] args) {
		Code11_10 MyStack = new Code11_10();
		
		System.out.println(MyStack.isEmpty());
		for(int i=0;i<10;i++)
			MyStack.push(i);
		System.out.println(MyStack.pop());
		System.out.println(MyStack.peek());
		System.out.println(MyStack.isEmpty());
		
	}
}
