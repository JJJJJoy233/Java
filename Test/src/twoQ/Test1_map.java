package twoQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1_map {
	public static void main(String[] args) {
		HashMap<Integer,Book> books = new HashMap<Integer,Book>();
		books.put(1, new Book(1,"������",20.0,"��"));
		books.put(2, new Book(2,"��ŵ�һ��",20.0,"��"));
		books.put(3, new Book(3,"���޴�½",20.0,"��"));
		books.put(4, new Book(4,"���Ʋ��",20.0,"��"));
		books.put(5, new Book(5,"ë��˼����й���ɫ����������",50.0,"���������"));
		//ͨ��Iterator����key-value
	    Iterator iter = books.entrySet().iterator();
	    while(iter.hasNext()) {
	       Map.Entry entry = (Map.Entry)iter.next();
	       System.out.println(entry.toString());
	    }
	
	}
}