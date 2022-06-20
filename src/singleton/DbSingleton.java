package singleton;

public class DbSingleton {
    // volatile to ensure visibility immediately to all threads
    private static volatile DbSingleton instance;

    private DbSingleton() {
        // Protect from Reflection API - If instance already created then disallow
        if (instance != null) {
            throw new RuntimeException("Use DbSingleton.getInstance() instead");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized(DbSingleton.class) {
                if (instance == null) { // Double checking because two threads may clash here
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

}
