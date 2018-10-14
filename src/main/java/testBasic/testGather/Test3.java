package testBasic.testGather;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test3 {
	public static void main(String[] args) {
		List<String> staff=new LinkedList<>();
		staff.add("Amy");
		staff.add("Bod");
		staff.add("Carl");
		
		ListIterator<String> iter = staff.listIterator();
		String first = iter.next();//visit first element
		iter.add("Juliet");
		System.out.println(staff);
	}

}
