package home.spring.ioc.exercises.first;

import java.util.List;

public class MessageFactory {

    public Message createEnglishMessage() {
        return new EnglishMessage();
    }

    public Message createFrenchMessage() {
        return new FrenchMessage();
    }

    public Message createCustomisedMessage(String textMessage) {
        return new CustomizedMessage(textMessage);
    }

    public Message createCustomisedMessage(String subject, String verb) {
        return new CustomizedMessage(subject, verb);
    }

    public Message createCustomisedMessage(String message, int loopCount) {
        return new CustomizedMessage(message, loopCount);
    }

    public Message createCustomisedMessage(List<String> messages) {
        return new CustomizedMessage(messages);
    }
}
