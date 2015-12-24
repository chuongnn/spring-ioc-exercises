package home.spring.ioc.exercises.first;

public class MessageAnnouncer implements Announcer {

    private String announcerName;
    private Message message;

    @Override
    public String announce() {
        return String.format("%s - announced by %s", message.getTextMessage(), announcerName);
    }

    public void setAnnouncerName(String announcerName) {
        this.announcerName = announcerName;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
