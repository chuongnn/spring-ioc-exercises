package home.spring.ioc.exercises.third;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

public class Bean implements SmartLifecycle{

    private Logger logger;
    private boolean running = false;
    private final int lifeCyclePhase;

    protected Bean(int lifeCyclePhase, Class beanClass) {
        this.lifeCyclePhase = lifeCyclePhase;
        logger = LoggerFactory.getLogger(beanClass);
    }

    protected void logMethodCall() {
        logger.info("\"{}\" of \"{}\" called", Thread.currentThread().getStackTrace()[2].getMethodName(), logger.getName());
    }

    @Override
    public boolean isAutoStartup() {
        logMethodCall();
        return false;
    }

    @Override
    public void stop(Runnable runnable) {
        logMethodCall();
        runnable.run();
        this.stop();
    }

    @Override
    public void start() {
        logMethodCall();
        running = true;
    }

    @Override
    public void stop() {
        logMethodCall();
        running = false;
    }

    @Override
    public boolean isRunning() {
        logMethodCall();
        return this.running;
    }

    @Override
    public int getPhase() {
        logMethodCall();
        return lifeCyclePhase;
    }
}
