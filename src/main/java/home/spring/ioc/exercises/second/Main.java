package home.spring.ioc.exercises.second;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("second/spring.xml");

        Object bean = context.getBean("underExaminingBean", UnderExaminingBean.class);

        context.close();

    }
}
