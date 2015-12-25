package home.spring.ioc.exercises.first;

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
}
