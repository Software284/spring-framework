package setter.dependency.injection.with.dependent.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import setter.dependency.injection.with.primitive.and.string.Student;

public class Test {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Actor s = (Actor)factory.getBean("actor");
		s.displayInfo();

	}

}
