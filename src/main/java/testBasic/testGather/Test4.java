package testBasic.testGather;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * 测试报错 java.util.ConcurrentModificationException
 * @author 开拓者
 *
 */
public class Test4 {
	public static void main(String[] args) {
		List<String> staff=new LinkedList<>();
		staff.add("Amy");
		staff.add("Bod");
		staff.add("Carl");
		
		ListIterator<String> iter1 = staff.listIterator();
		ListIterator<String> iter2 = staff.listIterator();
		iter1.next();
		iter1.remove();
		iter2.next();
	}

}
