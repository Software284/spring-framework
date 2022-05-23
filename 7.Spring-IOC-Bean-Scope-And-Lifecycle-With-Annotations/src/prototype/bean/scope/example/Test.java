package prototype.bean.scope.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		ModalInfo q1 = (ModalInfo)factory.getBean("modalInfo");
		ModalInfo q2 = (ModalInfo)factory.getBean("modalInfo");
		boolean bool= q1==q2;
		System.out.println("q1 and q2 objects pointing to each other:"+bool);
		System.out.println("q1 pointing to memory location:"+q1);
		System.out.println("q2 pointing to memory location:"+q2);
		

	}

}
