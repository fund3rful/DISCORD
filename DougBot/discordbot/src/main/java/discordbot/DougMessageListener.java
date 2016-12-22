package discordbot;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

public class DougMessageListener implements MessageCreateListener {

	public void onMessageCreate(DiscordAPI api, Message message) {
        System.out.println(message.getAuthor().getName() + ": " + message.getContent());
		
	}

}
