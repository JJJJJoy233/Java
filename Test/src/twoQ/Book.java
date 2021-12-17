package twoQ;

public class Book {
	public int number;
	public String bookname;
	public double price;
	public String press;
	
	public Book(int number,String bookname,double price,String press) {
		this.number = number;
		this.bookname = bookname;
		this.price = price;
		this.press = press;
	}
	@Override
	public String toString() {
		return this.bookname+" "+this.number+" "+this.press+" "+this.price;
	}
}
