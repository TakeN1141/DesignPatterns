package Mediator;

public abstract class User {

    protected MediatorMessage mediatorMessage;
    protected String username;

    public User(MediatorMessage mediatorMessage, String username){
        this.mediatorMessage = mediatorMessage;
        this.username=username;

    }

    public abstract void send(String message);
    public abstract void receive(String message);

}
