package setter.dependency.injection.with.collection.list.with.string;

import java.util.List;

public class Questions {
	private int id;
	private String name;
	private List<String> list;
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
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name);
		System.out.println(list);
	}

	
	
	
	
	
	
}
