package home.spring.ioc.exercises.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("first/spring.xml");

        Announcer announcer = context.getBean("announcer", Announcer.class);
        Announcer timedAnnouncer =context.getBean("timedAnnouncer", Announcer.class);

        System.out.println(announcer.announce());

        System.out.println(timedAnnouncer.announce());

        Thread.sleep(1000);

        System.out.println(timedAnnouncer.announce());
    }
}
