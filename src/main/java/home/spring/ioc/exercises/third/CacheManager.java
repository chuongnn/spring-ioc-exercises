package home.spring.ioc.exercises.third;

public class CacheManager extends Bean{

    private DatabaseManager databaseManager;

    public CacheManager(int lifeCyclePhase, DatabaseManager databaseManager) {
        super(lifeCyclePhase, CacheManager.class);
        this.databaseManager = databaseManager;
    }
}
