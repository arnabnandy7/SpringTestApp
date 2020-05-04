package Controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Entity.Emp;

public class Test {


	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(r);
		
		Emp e=(Emp)bean.getBean("e");
		e.display();
	}

}
