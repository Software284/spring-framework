package init_method.and.destroy_method.bean.lifecycle.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext r = new ClassPathXmlApplicationContext("applicationContext.xml");
		Fortune q1 = (Fortune)r.getBean("myLifecycle",Fortune.class);
		System.out.println(q1.getFortuneService());
		r.close();
		
	

	}

}
