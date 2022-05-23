package setter.dependency.injection.with.collection.map.with.object;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answers,Publisher> answers;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Map<Answers, Publisher> getAnswers() {
		return answers;
	}




	public void setAnswers(Map<Answers, Publisher> answers) {
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
			System.out.println("Answer:"+entry.getKey().getAnswer()+" Posted By:"+entry.getValue().getPublisher());
		}
	}
	
	
	
	
}
