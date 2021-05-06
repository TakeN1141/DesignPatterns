package Mediator;

public interface MediatorMessage {

    void addUser(User user);
    void sendMessage(String message, User user);
    void kickUser(Bot bot, User user, String message);

}
