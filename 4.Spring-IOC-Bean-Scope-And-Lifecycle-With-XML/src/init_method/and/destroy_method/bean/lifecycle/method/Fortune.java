package init_method.and.destroy_method.bean.lifecycle.method;

public class Fortune {
	public String getFortuneService() {
		return "Happy Now";
	}
	
	public void doSomeStuffBeforeInitialization() {
		System.out.println("Before Initializing Bean Calling");
	}
	
	public void doSomeStuffBeforeDestruction() {
		System.out.println("Before Destroying Bean Calling");
	}
}
