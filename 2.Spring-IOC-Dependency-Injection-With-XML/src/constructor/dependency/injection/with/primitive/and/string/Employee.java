package constructor.dependency.injection.with.primitive.and.string;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println(id+" "+name);
	}
}
