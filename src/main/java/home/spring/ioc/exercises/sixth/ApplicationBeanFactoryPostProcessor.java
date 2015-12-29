package home.spring.ioc.exercises.sixth;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class ApplicationBeanFactoryPostProcessor extends LogTrait implements BeanFactoryPostProcessor, Ordered {

    private int order;

    public ApplicationBeanFactoryPostProcessor() {
        super(ApplicationBeanFactoryPostProcessor.class);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logCallingMethod();
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
