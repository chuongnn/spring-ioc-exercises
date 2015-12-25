package home.spring.ioc.exercises.first;

public class MessageFactory {

    public static Message createEnglishMessage() {
        return new EnglishMessage();
    }

    public static Message createFrenchMessage() {
        return new FrenchMessage();
    }
}
