package setter.dependency.injection.with.collection.set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import setter.dependency.injection.with.dependent.object.Actor;

public class Test {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Questions  s = (Questions)factory.getBean("myQuestions2");
		s.displayInfo();

	}

}
