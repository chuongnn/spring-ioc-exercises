package home.spring.ioc.exercises.first;

import java.util.List;

public class CustomizedMessage implements Message {

    private String textMessage;

    public CustomizedMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public CustomizedMessage(String subject, String verb) {
        this.textMessage = String.format("%s %s", subject, verb);
    }

    public CustomizedMessage(String message, int loopCount) {
        this.textMessage = "";
        for (int i = 0; i < loopCount; i++) {
            this.textMessage = String.format("%s %s", this.textMessage, message);
        }
    }

    public CustomizedMessage(List<String> messages) {
        this.textMessage = "";
        for (int i = 0; i < messages.size(); i++) {
            this.textMessage = String.format("%s %s", this.textMessage, messages.get(i));
        }
    }

    public CustomizedMessage() {
    }

    @Override
    public String getTextMessage() {
        return this.textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}
