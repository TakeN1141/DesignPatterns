package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MediatorMessage {

    private List<User> users;

    public Chat() {
        this.users = new ArrayList<>();

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User chatUser : this.users) {
            chatUser.receive(message);
        }
    }

    @Override
    public void kickUser(Bot bot, User user, String message) {
        if (user.mediatorMessage.equals("cat")) {
            bot.readMessage("Bot has kicked: " + user);
            bot.readMessage("This message is forbidden!");
        }
    }
}
