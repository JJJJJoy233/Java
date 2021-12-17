package twoQ;

public class Student {
	public String Student_number;
	public String name;
	public int age;
	public Student(String number,String name,int age) {
		this.Student_number = number;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.Student_number+" "+this.name+" "+this.age;
	}
}
