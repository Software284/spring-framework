package constructor.dependency.injection.with.collection.map.with.object;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answers,Publisher> answers;
	
	
	public Question() {
		
	}


	public Question(int id, String name, Map<Answers, Publisher> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo() {
		System.out.println("question id:"+id);
		System.out.println("question name:"+name);
		System.out.println("Answers");
		Set<Entry<Answers, Publisher>> set = answers.entrySet();
		Iterator<Entry<Answers, Publisher>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Answers, Publisher> entry = itr.next();
			System.out.println("Answer:"+entry.getKey().toString()+" Posted By:"+entry.getValue().toString());
		}
	}
	
	
	
	
}
