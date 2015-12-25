package home.spring.ioc.exercises.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnderExaminingBean {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String name;
    private String family;

    public UnderExaminingBean(String name) {
        this.name = name;
        logMethodCall();
    }

    public void init() {
        logMethodCall();
    }

    public void destroy() {
        logMethodCall();
    }

    public void setFamily(String family) {
        this.family = family;
        logMethodCall();
    }

    private void logMethodCall() {
        logger.info("{} method called", Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
