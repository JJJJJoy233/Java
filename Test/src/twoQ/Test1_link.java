package twoQ;

import java.util.LinkedList;
public class Test1_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book(1,"万古神帝",20.0,"无"));
		books.add(new Book(2,"万古第一神",20.0,"无"));
		books.add(new Book(3,"斗罗大陆",20.0,"无"));
		books.add(new Book(4,"斗破苍穹",20.0,"无"));
		books.add(new Book(5,"元神",20.0,"无"));
		for(Book book:books) {
			System.out.println(book.toString());
		}
	}

}
