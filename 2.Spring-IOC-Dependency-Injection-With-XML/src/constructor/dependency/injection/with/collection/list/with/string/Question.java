package constructor.dependency.injection.with.collection.list.with.string;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;
	
	
	public Question() {
		
	}
	
	
	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name);
		System.out.println("answer are");
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}


