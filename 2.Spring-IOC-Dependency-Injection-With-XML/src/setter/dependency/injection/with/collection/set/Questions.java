package setter.dependency.injection.with.collection.set;

import java.util.List;
import java.util.Set;

public class Questions {
	private int id;
	private String name;
	private Set<String> list;
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
	public Set<String> getList() {
		return list;
	}
	public void setList(Set<String> list) {
		this.list = list;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name);
		System.out.println(list);
	}

	
	
	
	
	
	
}
