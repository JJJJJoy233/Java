package twoQ;

import java.util.LinkedList;
public class Test1_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book(1,"������",20.0,"��"));
		books.add(new Book(2,"��ŵ�һ��",20.0,"��"));
		books.add(new Book(3,"���޴�½",20.0,"��"));
		books.add(new Book(4,"���Ʋ��",20.0,"��"));
		books.add(new Book(5,"Ԫ��",20.0,"��"));
		for(Book book:books) {
			System.out.println(book.toString());
		}
	}

}
