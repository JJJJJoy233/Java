package twoQ;

import java.util.Scanner;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入：学号 姓名 年龄（输入exit退出）");
		Scanner input = new Scanner(System.in);
		String number =input.next();
		
	    Map<Integer,Student> students=new TreeMap<Integer,Student>(); //创建TreeMap
	    
		while(!number.equals("exit")) {
			String name = input.next();
			int age = input.nextInt();
			students.put(age,new Student(number,name,age));
			number = input.next();
		}
		File file = new File("students.txt");
		PrintWriter output = new PrintWriter(file);
		
		Iterator iter = students.entrySet().iterator();
	    while(iter.hasNext()) {
	       Map.Entry entry = (Map.Entry)iter.next();
	       output.print(entry.getValue()+"\n");
	       System.out.println(entry.getValue());
	    }
	    output.close();
	}
}
