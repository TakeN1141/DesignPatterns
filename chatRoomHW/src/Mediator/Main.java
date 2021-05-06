package Mediator;

public class Main {

    public static void main(String[] args) {

        MediatorMessage chat = new Chat();
        Bot bot = Bot.getInstance();

        bot.readMessage("Connection Established.");
        User user1 = new ChatUser(chat , "Dave");
        User user2 = new ChatUser(chat , "Simon");
        User user3 = new ChatUser(chat , "Mike");

        user1.send("Hi all!");
        user2.send("Hello!");
        user3.send("Hi, i'm cat !");
        user3.send("cat");
        bot.kickUser("Bot(Guard) kicked " + user3.username +"!");
    }
}