package home.spring.ioc.exercises.fourth;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("forth/spring.xml");

        context.start();

        context.stop();
    }
}
