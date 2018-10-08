package testBasic.testGather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		List<String> listStrs=new ArrayList<String>();
		listStrs.add("111");
		listStrs.add("122");
		listStrs.add("133");
		listStrs.add("144");
		System.out.println(listStrs);
		listStrs.forEach(item->
			System.out.println(item)
		);
		
		Iterator<String> iterator = listStrs.iterator();
		if(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println(listStrs);
		listStrs.forEach(item->
			System.out.println(item)
		);
	}

}
