package init_method.and.destroy_method.bean.lifecycle.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext r = new ClassPathXmlApplicationContext("applicationContext.xml");
		ModalInfo q1 = (ModalInfo)r.getBean("modalInfo",ModalInfo.class);
		System.out.println(q1.getModalInformation());
		r.close();
		
	

	}

}
