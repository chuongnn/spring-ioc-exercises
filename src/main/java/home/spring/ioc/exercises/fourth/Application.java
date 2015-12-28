package home.spring.ioc.exercises.fourth;

public class Application {

    private UserDAO employee;
    private UserDAO employer;
    private StoreDAO bookStore;
    private StoreDAO computerStore;

    public void setEmployee(UserDAO employee) {
        this.employee = employee;
    }

    public void setEmployer(UserDAO employer) {
        this.employer = employer;
    }

    public void setBookStore(StoreDAO bookStore) {
        this.bookStore = bookStore;
    }

    public void setComputerStore(StoreDAO computerStore) {
        this.computerStore = computerStore;
    }
}
