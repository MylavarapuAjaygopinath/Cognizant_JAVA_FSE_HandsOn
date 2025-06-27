package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void performTask() {
        logger.info("Starting task execution in MyService");
        logger.warn("Low memory warning detected");
        logger.error("Task execution failed due to null pointer");
    }

    public static void main(String[] args) {
        MyService service = new MyService();
        service.performTask();
    }
}
