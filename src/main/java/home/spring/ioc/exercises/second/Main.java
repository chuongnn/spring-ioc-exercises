package home.spring.ioc.exercises.second;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("second/spring.xml");

        context.registerShutdownHook();

        Object bean = context.getBean("underExaminingBean", UnderExaminingBean.class);


    }
}
