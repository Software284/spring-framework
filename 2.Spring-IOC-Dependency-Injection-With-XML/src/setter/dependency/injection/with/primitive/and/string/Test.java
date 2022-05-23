package setter.dependency.injection.with.primitive.and.string;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructor.dependency.injection.with.primitive.and.string.Employee;

public class Test {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Student s = (Student)factory.getBean("s1");
		System.out.println(s.toString());

	}

}
