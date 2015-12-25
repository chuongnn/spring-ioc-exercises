package home.spring.ioc.exercises.first;

public class CustomizedMessage implements Message {

    private final String textMessage;

    public CustomizedMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String getTextMessage() {
        return this.textMessage;
    }
}
