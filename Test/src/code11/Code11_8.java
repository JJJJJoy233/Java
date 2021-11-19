package code11;
import java.util.ArrayList;
public class Code11_8 {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list? "+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? "+cityList.indexOf("Denver"));
		System.out.println("Is the list empty? "+cityList.isEmpty());
		
		cityList.add(2,"Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		
		for(int i = cityList.size()-1;i>=0;i--) {
			System.out.println(cityList.get(i)+" ");
		}
		System.out.println();
		
		//Create a list to store two circles
		ArrayList<Code11_2> list = new ArrayList<>();
		
		list.add(new Code11_2(2));
		list.add(new Code11_2(3));
		
		//Display the area of the first circle in the list
		System.out.println("The area of the circle? "+list.get(0).getArea());
	}
}
