package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/*3 types of SpringBootApplication:-
1.@configuration=instructs that a spring configuration class is being used instead of XML to define
2.@EnableAutoconfiguration=is a Spring boot specific annotation
3.@ComponentScan=scans project for spring components annotated with@Sevice,@Repository,@Component*/
@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*int x=sc.nextInt();
		System.out.println(x);
		Employee e=context.getBean(Employee.class);
		e.setEmpid(10123);
		e.setEmpname("Mrunali Patil");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
		
	}

}
