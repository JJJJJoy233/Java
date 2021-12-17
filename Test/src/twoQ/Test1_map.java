package twoQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1_map {
	public static void main(String[] args) {
		HashMap<Integer,Book> books = new HashMap<Integer,Book>();
		books.put(1, new Book(1,"万古神帝",20.0,"无"));
		books.put(2, new Book(2,"万古第一神",20.0,"无"));
		books.put(3, new Book(3,"斗罗大陆",20.0,"无"));
		books.put(4, new Book(4,"斗破苍穹",20.0,"无"));
		books.put(5, new Book(5,"毛泽东思想和中国特色社会主义概论",50.0,"人民出版社"));
		//通过Iterator遍历key-value
	    Iterator iter = books.entrySet().iterator();
	    while(iter.hasNext()) {
	       Map.Entry entry = (Map.Entry)iter.next();
	       System.out.println(entry.toString());
	    }
	
	}
}