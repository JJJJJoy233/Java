package quiz11;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz11_8 {
	public static void main(String[] args) {
		Account A = new Account("George",1122,1000,1.5);
		Transaction t1 = new Transaction(new Date(),'D',30,"t1,D");
		A.deposit(t1);
		
		Transaction t2 = new Transaction(new Date(),'D',40,"t2,D");
		A.deposit(t2);
		
		Transaction t3 = new Transaction(new Date(),'D',50,"t3,D");
		A.deposit(t3);
		
		Transaction t4 = new Transaction(new Date(),'W',5,"t4,W");
		A.withdraw(t4);
		
		Transaction t5 = new Transaction(new Date(),'D',4,"t5,W");
		A.withdraw(t5);
		
		Transaction t6 = new Transaction(new Date(),'D',2,"t6,W");
		A.withdraw(t6);
		
		System.out.printf("Name: %s\nAnnualInterestRate: %f\nBalance: %f\n",A.get_name(),A.get_annualInterestRate(),A.get_balance());
		for(Transaction t: (ArrayList<Transaction>)A.get_transaction()) {
			System.out.println("Date: "+t.get_date()+" Type: "+t.get_type()+" Balance: "+ t.get_amount()+" Description: "+t.get_description());
		}
	}
}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	//构造方法
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	public Account(String name,int id,double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account(String name,int id,double balance,double annualInterestRate) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate/100;
	}
	//访问器
	public int get_id() {
		return this.id;
	}
	public double get_balance() {
		return this.balance;
	}
	public double get_annualInterestRate() {
		return this.annualInterestRate;
	}
	public String get_dateCreated() {
		return this.get_dateCreated().toString();
	}
	public String get_name() {
		return this.name;
	}
	public ArrayList get_transaction() {
		return this.transactions;
	}
	//修改器
	public void set_id(int id) {
		this.id = id;
	}
	public void set_balance(double balance) {
		this.balance = balance;
	}
	public void set_annualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//method
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return this.balance *this.get_annualInterestRate();
	}
	public void withdraw(Transaction transaction) {
		this.balance -=transaction.get_amount();
		this.transactions.add(transaction);
	}
	public void deposit(Transaction transaction) {
		this.balance +=transaction.get_amount();
		this.transactions.add(transaction);
	}
}

class Transaction{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//构造方法
	public Transaction(Date date,char type,double amount) {
		this.amount = amount;
		this.type = type;
		this.date = date;
	}
	public Transaction(Date date,char type,double amount,String description) {
		this.amount = amount;
		this.type = type;
		this.description = description;
		this.date = date;
	}
	
	//访问器
	public String get_date() {
		return this.date.toString();
	}
	public char get_type() {
		return this.type;
	}
	public double get_amount() {
		return this.amount;
	}
	public double get_balance() {
		return this.balance;
	}
	public String get_description() {
		return this.description;
	}
	
	//修改器
	public void set_date(Date date) {
		this.date = date;
	}
	public void set_type(char type) {
		this.type = type;
	}
	public void set_amount(double amount) {
		this.amount = amount;
	}
	public void set_balance(double balance) {
		this.balance = balance;
	}
	public void set_description(String description) {
		this.description = description;
	}
}