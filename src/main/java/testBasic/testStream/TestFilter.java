package testBasic.testStream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
	
	
	public static void main(String[] args) {
		List<String> wordList=new LinkedList<>();
		wordList.add("112341212341asdasd");
		wordList.add("2qwerqwre32qwerqwerq");
		wordList.add("3qasdfasfdqe");
		wordList.add("4asdf72132asd");
		wordList.add("5qweqrqerqwreqwreq");
		
		Stream<String> longWords = wordList.stream().filter(w->w.length()>12);
		
		Stream<String> map = wordList.stream().map(t->t+"asd");
		CreatingSteams.show("map", map);
		List<String> collect = longWords.collect(Collectors.toList());
		for(String c:collect) {
			System.out.println(c);
		}
	}

}
