package init_method.and.destroy_method.bean.lifecycle.method;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class ModalInfo {
	
	public String getModalInformation() {
		return "they are so cute";
	}
	
	@PostConstruct
	public void doStuffAfterInitialization() {
		System.out.println("called after initialization");
	}
	
	
	@PreDestroy
	public void doStuffBeforeDestroyed() {
		System.out.println("called before destroyed");
	}
	
	
	
}
