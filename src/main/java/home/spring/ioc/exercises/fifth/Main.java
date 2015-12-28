package home.spring.ioc.exercises.fifth;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("fifth/spring.xml");

        context.start();

        context.stop();
    }
}
