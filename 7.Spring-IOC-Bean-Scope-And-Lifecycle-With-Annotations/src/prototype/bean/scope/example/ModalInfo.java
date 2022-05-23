package prototype.bean.scope.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class ModalInfo {
	
	public String getModalInformation() {
		return "they are so cute";
	}
	
	
	
}
