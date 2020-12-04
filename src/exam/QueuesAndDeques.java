package exam;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class QueuesAndDeques {

	public static void main(String[] args) throws IOException {
		playWithArrayDeque();
		QueuesAndDeques.playWithConcurrentLinkedQueue();
		QueuesAndDeques.playWithArrayList();
	}
	
	protected static void playWithConcurrentLinkedQueue() {
		ConcurrentLinkedQueue<Integer> linkedQueue = new ConcurrentLinkedQueue();
		for (int i = 10; i < 20; i++) {
			linkedQueue.add(Integer.valueOf(i));
		}
		try {
			linkedQueue.add(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(linkedQueue.stream().
				map(x -> x.toString()).
				collect(Collectors.joining(", ")));
	}

	private static void playWithArrayDeque() {
		ArrayDeque<Integer> numDeque = new ArrayDeque<>();
		for (int i = 10; i < 20; i++) {
			numDeque.add(Integer.valueOf(i));
		}
		for (int j = 20; j < 30; j++) {
			numDeque.push(Integer.valueOf(j));
		}
		try {
			numDeque.add(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String contents = numDeque.stream().map(s -> s.toString()).collect(Collectors.joining(", "));
		System.out.println(contents);
		System.out.println("numDeque.pop():" + numDeque.pop());
		System.out.println("numDeque.removeFirst():" + numDeque.removeFirst());
		System.out.println("numDeque.remove():" + numDeque.remove());
	}
	
	private static void playWithArrayList() throws IOException {
		List<String> s1 = new ArrayList<String>(); 
		String s = null; 
		s1.add("a"); 
		s1.add(s); //1 
		s1.add("b"); 
		s1.add(null);
		System.out.println("s1 before remove(null): " + s1);
		s1.remove(s); //2 
		System.out.println("s1 after remove(null): " + s1); //3 
	}

}
