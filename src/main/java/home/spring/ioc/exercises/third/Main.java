package home.spring.ioc.exercises.third;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("third/spring.xml");

        context.start();

        context.stop();
    }
}
