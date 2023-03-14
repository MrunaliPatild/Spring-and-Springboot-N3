package org.tnsif.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MobileExecutor {

	public static void main(String[] args) {
		/*Airtel a=new Airtel();
		a.call();
		a.message();
		
		Jio j=new Jio();
		j.call();
		j.message();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel a=(Airtel) c.getBean("airtel");
		a.call();
		a.message();*/
		
		/*Jio a=(Jio) c.getBean("jio");
		a.call();
		a.message();*/
		
		Sim s=c.getBean("",Sim.class);
		s.call();
		s.message();
	}

}
