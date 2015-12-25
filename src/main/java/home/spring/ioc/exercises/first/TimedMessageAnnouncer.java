package home.spring.ioc.exercises.first;

public abstract class TimedMessageAnnouncer implements Announcer{

    @Override
    public String announce() {
        return String.format("%s - Announced by %s", getTimedMessage().getTextMessage(), this.getClass());
    }

    protected abstract Message getTimedMessage();
}
