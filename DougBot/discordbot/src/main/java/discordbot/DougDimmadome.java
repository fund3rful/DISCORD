package discordbot;

import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;

public class DougDimmadome {

	public static void main(String[] args) {
		//Log into bot
		DiscordAPI api = Javacord.getApi("MjYxMjMyNzUwNzEzODk2OTY3.Cz0TFQ.1OCOgDvUg9Km6Vexr3r2q63K2Cs", true);
		//Blocks thread until packet is recieved
		api.connect(new FutureCallback<DiscordAPI>(){
			public void onSuccess(final DiscordAPI api){
				DougMessageListener myListener = new DougMessageListener();
				api.registerListener(myListener);
			}

			public void onFailure(Throwable t) {
				t.printStackTrace();
				
			}
			
		});
		
		
	}

}
