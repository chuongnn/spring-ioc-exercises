package home.spring.ioc.exercises.sixth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTrait {
    private Logger logger;

    protected LogTrait(Class loggingClass) {
        logger = LoggerFactory.getLogger(loggingClass);
    }

    protected final void logCallingMethod() {
        logger.info("\"{}\" of \"{}\" called", Thread.currentThread().getStackTrace()[2].getMethodName(), logger.getName());
    }
}
