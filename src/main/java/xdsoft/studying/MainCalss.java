package xdsoft.studying;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCalss {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("/application-context.xml");
		MyBean bn = (MyBean) ac.getBean("my-bean");

		String classname = bn.getClassname();
		Class<?> cl = Class.forName(classname);
		testInterf obj = (testInterf) cl.newInstance();
		obj.prn();

	}

}

class AAA implements testInterf {

	public void prn() {

		System.out.println("AAA");

	}

}

class BBB implements testInterf {

	public void prn() {

		System.out.println("BBB");

	}

}
