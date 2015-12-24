package home.spring.ioc.exercises.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Announcer announcer = context.getBean("announcer", Announcer.class);

        System.out.println(announcer.announce());
    }
}
