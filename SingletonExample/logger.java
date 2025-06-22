package Cognizant_JAVA_FSE_HandsOn.SingletonExample;
public class logger {
    private static logger instance;
    private logger() {
        System.out.println("Logger initialized.");
    }
    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
    public static void main(String[] args) {
        logger logger1=logger.getInstance();
        logger1.log("This is the first log message.");
        logger logger2=logger.getInstance();
        logger2.log("This is the second log message.");
        if (logger1==logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances were created!");
        }
    }
}