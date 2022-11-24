//Serializaton
package datastructure1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class MainRunner {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<Student>();
		do {
			System.out.println("enter student id name and percentage");
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student std=new Student(id, name, per);
			boolean rs=ts.add(std);
			if(rs==true)
				System.out.println("Successfully added");
			else
				System.out.println("it is duplicate");
			System.out.println("do you have more students");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
				break;
			
		} while (true);
		
		System.out.println("user enterd students info");
		for (Student std : ts) {
			System.out.println(std);
		}
		//Selrialization
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("d:mycontent/student.text");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(ts);
			out.flush();
			fout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
