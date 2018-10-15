package testBasic.testGather.testPrioriryQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<LocalDate> pq=new PriorityQueue<>();
		pq.add(LocalDate.of(1993, 12, 9));
		pq.add(LocalDate.of(1923, 10, 9));
		pq.add(LocalDate.of(1793, 02, 23));
		pq.add(LocalDate.of(1893, 12, 19));
		pq.add(LocalDate.of(2003, 12, 9));
		System.out.println("Iterating over elements...");
		for(LocalDate date:pq) {
			System.out.println(date);
		}
		System.out.println("Removing elements...");
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		
		
		
	}
}
