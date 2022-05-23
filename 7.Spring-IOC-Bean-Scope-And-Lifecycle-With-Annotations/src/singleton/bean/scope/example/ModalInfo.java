package singleton.bean.scope.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class ModalInfo {
	
	public String getModalInformation() {
		return "they are so cute";
	}
	
	
	
}
