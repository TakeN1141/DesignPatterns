package Mediator;

public class Bot {
    private static Bot instance;

    private  Bot(){
    }

    public static Bot getInstance(){
        if(instance == null){
            instance = new Bot();
        }
        return instance;
    }
    public void readMessage(String message){
        System.out.println("Message From Bot:(Guard): " + message);
    }
    public  void kickUser(String message){
        System.out.println("Message From Bot:(Guard): " + message);
        System.out.println("Reason: This message is forbidden!");
    }
}
