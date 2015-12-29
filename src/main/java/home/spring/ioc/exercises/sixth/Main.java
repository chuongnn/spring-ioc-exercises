package home.spring.ioc.exercises.sixth;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("sixth/spring.xml");

        context.start();

        context.stop();

        context.close();
    }
}
