//de-serialization
package datastructure1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.TreeSet;

public class MainRunner1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=new FileInputStream("d:mycontent/student.text");
		ObjectInputStream in=new ObjectInputStream(fin);
		
		Object obj=in.readObject();
		
		TreeSet ts=(TreeSet)obj;
		
		for (Object ob : ts) {
			System.out.println(ob);
		}
	}

}
