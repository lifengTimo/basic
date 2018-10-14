package testBasic.testGather;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<String> staff=new LinkedList<>();
		staff.add("Amy");
		staff.add("Bod");
		staff.add("Carl");
		
		Iterator<String> iter = staff.iterator();
		String first = iter.next();//visit first element
		String second=iter.next();//visit second element
		iter.remove();//remove last visited element
		System.out.println(staff);
	}

}
