import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.*;
import java.sql.SQLOutput;

public class Bot {
    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "ODE0NjQwNDcwMjIyNzAwNTk0.YDgzDw.-4mBGVDaJXPmlV-pEZFNiUM-bUo";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        final String URL = "https://api.jikan.moe/v3";
        String requestURL;

        //parser
        //try
        //{
        //    JSONParser parser = new JSONParser();
        //    JSONObject simpleJSONObject = (JSONObject) parser.parse(data);
        //    Map sol = (Map)simpleJSONObject.get("url");
        //    //String season =
        //}catch(Exception e)
        //{
        //    System.out.println(e.getMessage());
        //    System.out.println("Oops, an error occurred!");
        //}
        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("?m" + name)) {
                requestURL = URL + "/search/manga?="+ name;
                URL url = new URL(requestURL);
                JSONParser parser = new JSONParser();
                JSONObject linkMAL = (JSONObject) parser.parse(in);
                String linkMAL1 = (String)linkMAL.get("url");
                event.getChannel().sendMessage(linkMAL);
            }

        });
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("?a" + name)) {
                requestURL = URL + "/search/anime?="+ name;
                URL url = new URL(requestURL);
                JSONParser parser = new JSONParser();
                JSONObject linkMAL = (JSONObject) parser.parse(in);
                String linkMAL1 = (String)linkMAL.get("url");
                event.getChannel().sendMessage(linkMAL);
                event.getChannel().sendMessage(linkMAL);
            }
        });
        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
