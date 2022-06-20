import java.util.logging.Logger;

import singleton.DbSingleton;

public class SingletonDemo {
    private static final Logger LOG = Logger.getLogger(SingletonDemo.class.getName());
    public static void main(String[] args) throws Exception {
        DbSingleton dbInstance0 = DbSingleton.getInstance();
        DbSingleton dbInstance1 = DbSingleton.getInstance();
        LOG.info(dbInstance0.toString());
        LOG.info(dbInstance1.toString());
    }
}
