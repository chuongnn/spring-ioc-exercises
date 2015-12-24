package home.spring.ioc.exercises.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Message frenchMessage = context.getBean("frenchMessage", Message.class);
        Message englishMessage = context.getBean("englishMessage", Message.class);

        System.out.println(frenchMessage.getTextMessage());
        System.out.println(englishMessage.getTextMessage());
    }
}
