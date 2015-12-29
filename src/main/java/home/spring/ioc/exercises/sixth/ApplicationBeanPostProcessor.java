package home.spring.ioc.exercises.sixth;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ApplicationBeanPostProcessor extends LogTrait implements BeanPostProcessor {

    protected ApplicationBeanPostProcessor() {
        super(ApplicationBeanPostProcessor.class);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        logCallingMethod();
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        logCallingMethod();
        return o;
    }
}
