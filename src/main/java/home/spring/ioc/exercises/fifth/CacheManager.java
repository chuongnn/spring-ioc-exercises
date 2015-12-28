package home.spring.ioc.exercises.fifth;


public class CacheManager {

    private DatabaseConnectionManager databaseConnectionManager;
    private int maxMemSize;

    public void setMaxMemSize(int maxMemSize) {
        this.maxMemSize = maxMemSize;
    }

    public void setDatabaseConnectionManager(DatabaseConnectionManager databaseConnectionManager) {
        this.databaseConnectionManager = databaseConnectionManager;
    }
}
