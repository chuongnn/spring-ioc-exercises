package home.spring.ioc.exercises.third;

public class DatabaseManager extends Bean {

    public DatabaseManager(int lifeCyclePhase) {
        super(lifeCyclePhase, DatabaseManager.class);
    }
}
