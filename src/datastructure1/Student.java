package datastructure1;

import java.io.Serializable;

public class Student implements Comparable<Student>,Serializable{
	
	int sid;
	String sname;
	double sper;
	
	public Student(int sid, String sname, double sper) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sper = sper;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSper() {
		return sper;
	}

	public void setSper(double sper) {
		this.sper = sper;
	}

	public int getSid() {
		return sid;
	}

	@Override
	public String toString() {
		return "Student [" + sid + ", " + sname + ", " + sper + "]";
	}

	@Override
	public int compareTo(Student std) {
		return this.sid-std.sid;
	}

}
