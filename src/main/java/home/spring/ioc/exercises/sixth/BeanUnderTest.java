package home.spring.ioc.exercises.sixth;

public class BeanUnderTest extends LogTrait {

    private String beanName;

    protected BeanUnderTest() {
        super(BeanUnderTest.class);
        logCallingMethod();
    }

    public void setBeanName(String beanName) {
        logCallingMethod();
        this.beanName = beanName;
    }

    public void init() {
        logCallingMethod();
    }

    public void destroy() {
        logCallingMethod();
    }
}
