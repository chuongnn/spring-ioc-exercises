package home.spring.ioc.exercises.fifth;

public class ResourceManager {

    private DatabaseConnectionManager databaseConnectionManager;
    private ExecutorManager executorManager;
    private FileWatcherManager fileWatcherManager;
    private CacheManager cacheManager;
    private String id;

    public void setDatabaseConnectionManager(DatabaseConnectionManager databaseConnectionManager) {
        this.databaseConnectionManager = databaseConnectionManager;
    }

    public void setExecutorManager(ExecutorManager executorManager) {
        this.executorManager = executorManager;
    }

    public void setFileWatcherManager(FileWatcherManager fileWatcherManager) {
        this.fileWatcherManager = fileWatcherManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public DatabaseConnectionManager getDatabaseConnectionManager() {
        return databaseConnectionManager;
    }

    public ExecutorManager getExecutorManager() {
        return executorManager;
    }

    public FileWatcherManager getFileWatcherManager() {
        return fileWatcherManager;
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setId(String id) {
        this.id = id;
    }
}
