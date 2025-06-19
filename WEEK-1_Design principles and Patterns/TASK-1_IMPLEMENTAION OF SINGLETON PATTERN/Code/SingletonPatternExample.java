class Logger {
    // Static and volatile instance variable
    private static volatile Logger instance;

    // Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Public method to provide global access point
    public static Logger getInstance() {
        // First check (no locking)
        Logger localInstance = instance;
        if (localInstance == null) {
            // Synchronized block to handle multithreading
            synchronized (Logger.class) {
                // Second check (with locking)
                if (localInstance == null) {
                    localInstance = new Logger();
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    }

    // Sample log method
    public void log(String message) {
        System.out.println(Thread.currentThread().getName() + " LOG: " + message);
    }
}

// Test class to verify Singleton behavior with multithreading
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Runnable task to access Logger instance
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Logging from thread.");
            System.out.println(Thread.currentThread().getName() + " -> HashCode: " + logger.hashCode());
        };

        // Create multiple threads
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}
