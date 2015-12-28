package home.spring.ioc.exercises.third;

public class MessagingManager extends Bean {

    private CacheManager cacheManager;
    private DatabaseManager databaseManager;

    public MessagingManager(int lifeCyclePhase, CacheManager cacheManager, DatabaseManager databaseManager) {
        super(lifeCyclePhase, MessagingManager.class);
        this.cacheManager = cacheManager;
        this.databaseManager = databaseManager;
    }
}
