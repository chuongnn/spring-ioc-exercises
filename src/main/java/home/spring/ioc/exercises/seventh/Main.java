package home.spring.ioc.exercises.seventh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("seventh/spring.xml");

        Employee employee_1 = context.getBean("employee-1", Employee.class);
        Employee employee_2 = context.getBean("employee-2", Employee.class);
        System.out.println(employee_1);
        System.out.println(employee_2);

        context.registerShutdownHook();
    }
}
