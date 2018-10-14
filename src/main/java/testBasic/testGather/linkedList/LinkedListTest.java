package testBasic.testGather.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> a=new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");
		
		List<String> b=new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		//merge the words from b into a
		
		ListIterator<String> listIter = a.listIterator();
		Iterator<String> iter = b.iterator();
		
		
		while(iter.hasNext()) {
			if(listIter.hasNext()) {
				listIter.next();
			}
			listIter.add(iter.next());
		}
		System.out.println(a);
		
		//remove every second word from b
		
		iter=b.iterator();
		while(iter.hasNext()){
			iter.next();//skip one element
			if(iter.hasNext()) {
				iter.next();//skip next element
				iter.remove();//remove that element
			}
		}
		System.out.println(b);
		//bulk operator:remove all words in b from a
		a.removeAll(b);
		System.out.println(a);
		
	}
}
