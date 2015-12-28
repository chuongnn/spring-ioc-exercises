package home.spring.ioc.exercises.fourth;

public class DAO {

    protected DatabaseManager databaseManager;

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
}
