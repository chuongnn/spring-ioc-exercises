package home.spring.ioc.exercises.third;

public class Application extends Bean {

    private MessagingManager messagingManager;
    private CacheManager cacheManager;
    private DatabaseManager databaseManager;

    public Application(int lifeCyclePhase, MessagingManager messagingManager, CacheManager cacheManager, DatabaseManager databaseManager) {
        super(lifeCyclePhase, Application.class);
        this.messagingManager = messagingManager;
        this.cacheManager = cacheManager;
        this.databaseManager = databaseManager;
    }
}
