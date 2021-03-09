import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Bot {
    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "ODE0NjQwNDcwMjIyNzAwNTk0.YDgzDw.-4mBGVDaJXPmlV-pEZFNiUM-bUo";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("sus")) {
                event.getChannel().sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⡟⠁⠄⠄⠄⠄⣠⣤⣴⣶⣶⣶⣶⣤⡀⠈⠙⢿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡟⠄⠄⠄⠄⠄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠄⠈⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⠁⠄⠄⠄⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢺⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡄⠄⠄⠄⠙⠻⠿⣿⣿⣿⣿⠿⠿⠛⠛⠻⣿⡄⠄⣾⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡇⠄⠄⠁ ⭕ ⠄⢹⣿⡗⠄ ⭕⢄⡀⣾⢀⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡇⠘⠄⠄⠄⢀⡀⠄⣿⣿⣷⣤⣤⣾⣿⣿⣿⣧⢸⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⡇⠄⣰⣿⡿⠟⠃⠄⣿⣿⣿⣿⣿⡛⠿⢿⣿⣷⣾⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⡄⠈⠁⠄⠄⠄⠄⠻⠿⢛⣿⣿⠿⠂⠄⢹⢹⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⡐⠐⠄⠄⣠⣀⣀⣚⣯⣵⣶⠆⣰⠄⠞⣾⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⣿⣷⡄⠄⠄⠈⠛⠿⠿⠿⣻⡏⢠⣿⣎⣾⣿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⣿⣿⣿⣿⣿⡿⠟⠛⠄⠄⠄⠄⠙⣛⣿⣿⣵⣿⡿⢹⡟⣿⣿⣿⣿⣿⣿⣿\n" +
                        "⣿⠿⠿⠋⠉⠄⠄⠄⠄⠄⠄⠄⣀⣠⣾⣿⣿⣿⡟⠁⠹⡇⣸⣿⣿⣿⣿⣿⣿\n" +
                        "⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠿⠿⠛⠋⠄⣸⣦⣠⣿⣿⣿⣿⣿⣿⣿");
            }
        });
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("red sus")) {
                event.getChannel().sendMessage("Red\uD83D\uDD34\uD83D\uDCDBsus\uD83D\uDCA6\uD83D\uDCA6Red\uD83D\uDD34\uD83D\uDD34suuuus.I\uD83D\uDC41\uD83D\uDC44\uD83D\uDC41said\uD83E\uDD20\uD83D\uDDE3\uD83D\uDCAC\uD83D\uDC71\uD83C\uDFFF\uD83D\uDCA6red\uD83D\uDC79\uD83D\uDD34,sus\uD83D\uDCA6\uD83D\uDCA6,hahahahaha \uD83E\uDD23. Why\uD83E\uDD14arent you\uD83D\uDC49\uD83D\uDE2F\uD83D\uDC48laughing\uD83D\uDE02?I\uD83D\uDC41\uD83C\uDF4A\uD83D\uDC65just made\uD83D\uDC51\uD83D\uDC51a reference\uD83D\uDC40\uD83D\uDC44\uD83D\uDE40\uD83D\uDC40\uD83D\uDC44\uD83D\uDE40to the popular\uD83D\uDC4D\uD83D\uDE01\uD83D\uDE02video\uD83D\uDCF9\uD83D\uDCF9game\uD83C\uDFAE\uD83C\uDFAE\"Among\uD83C\uDDF7\uD83C\uDDF4\uD83C\uDF9B\uD83D\uDCB0 Us \uD83D\uDC68\uD83D\uDC68How can you\uD83D\uDC48 \uD83D\uDC48not laugh\uD83D\uDE02\uD83D\uDE02at it?Emergency meeting\uD83D\uDCAF\uD83E\uDD1DGuys \uD83D\uDC66 \uD83D\uDC68this here guy\uD83D\uDC68\uD83D\uDC71\uD83C\uDFFB\uD83D\uDC68\uD83C\uDFFBdoesnt laugh\uD83E\uDD23☑\uD83D\uDE02\uD83D\uDE05at my funny\uD83D\uDE03\uD83D\uDE02\uD83C\uDF7A\uD83D\uDE1B\uD83D\uDE03Among\uD83D\uDCB0\uD83D\uDCB0Us\uD83D\uDC68\uD83D\uDC68memes\uD83D\uDC38\uD83D\uDE02Lets\uD83D\uDE46\uD83D\uDE46beat✊\uD83D\uDC4A\uD83C\uDFFB\uD83D\uDE30\uD83D\uDC4Ahim\uD83D\uDC74\uD83D\uDC68to death\uD83D\uDC80\uD83D\uDCA5❓\uD83D\uDC80Dead\uD83D\uDC80\uD83D\uDE02☠body\uD83D\uDC83\uD83D\uDC83reported☎!Skip\uD83D\uDC27\uD83C\uDFC3\uD83C\uDFFC!Skip\uD83D\uDC27!Vote\uD83D\uDD1D\uD83D\uDD1Dblue\uD83D\uDC99\uD83D\uDC99Blue\uD83D\uDC99\uD83D\uDC99was not an impostor\uD83D\uDE0E\uD83D\uDE20Among\uD83D\uDE02\uD83D\uDE46\uD83C\uDFFDus\uD83D\uDC68\uD83D\uDC68in a nutshell\uD83D\uDE20\uD83D\uDE20hahahaha\uD83D\uDE02\uD83D\uDC4C\uD83D\uDC4B\uD83D\uDE02.What?!Youre still\uD83E\uDD1E\uD83D\uDE4Cnot laughing\uD83D\uDE02\uD83D\uDE02your\uD83D\uDC49\uD83D\uDC49ass\uD83C\uDF51off\uD83D\uDCF4\uD83D\uDCF4☠?I\uD83D\uDC41made\uD83D\uDC51\uD83D\uDC51SEVERAL\uD83D\uDCAF\uD83D\uDCAFfunny\uD83D\uDE00\uD83D\uDE02\uD83D\uDE1B\uD83D\uDE03❓references\uD83D\uDC40\uD83D\uDC44\uD83D\uDE40\uD83D\uDCD6to Among\uD83D\uDCB0\uD83D\uDC91\uD83D\uDC68\u200D❤️\u200D\uD83D\uDC68\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC69Us\uD83D\uDC68\uD83C\uDDFA\uD83C\uDDF8and YOU\uD83D\uDC48\uD83C\uDFFC\uD83D\uDE02\uD83D\uDC49\uD83D\uDD25STILL\uD83E\uDD1E\uD83D\uDE4C\uD83D\uDE44ARENT LAUGHING\uD83D\uDE02\uD83D\uDE0E\uD83D\uDCA6??!!!Bruh⚠\uD83D\uDE33\uD83E\uDD23\uD83D\uDE02Ya\uD83D\uDE4F\uD83C\uDFBC\uD83D\uDE40hear\uD83D\uDC42that?Wooooooosh\uD83D\uDCA6\uD83D\uDC7D\uD83D\uDC7E\uD83D\uDCA6\uD83D\uDC7D\uD83D\uDC7E.Whats\uD83D\uDE26\uD83D\uDE26woooosh\uD83D\uDE81\uD83D\uDE81?Oh\uD83D\uDE40\uD83D\uDE40nothing❌\uD83D\uDEABJust the sound\uD83D\uDC42\uD83D\uDD0Aof a joke\uD83D\uDE02\uD83D\uDE02flying✈✈over\uD83D\uDE33\uD83D\uDE4A\uD83D\uDCA6\uD83D\uDD01your\uD83D\uDC49\uD83D\uDC49head\uD83D\uDC86\uD83D\uDC86Whats\uD83D\uDE26\uD83E\uDD14that?You\uD83D\uDC48\uD83D\uDC49think\uD83D\uDCAD\uD83D\uDCADim\uD83D\uDC4C\uD83D\uDC98annoying\uD83D\uDE20\uD83D\uDE20?Kinda\uD83D\uDE45\uD83D\uDE45sus\uD83D\uDCA6\uD83D\uDCA6bro\uD83D\uDC46\uD83C\uDF08☺\uD83D\uDC6CHahahaha\uD83D\uDE02\uD83D\uDE02!Anyway\uD83D\uDD1B\uD83D\uDD1Byea\uD83D\uDE00\uD83D\uDCAFgotta\uD83D\uDC49\uD83D\uDC49go\uD83C\uDFC3\uD83C\uDFC3dotasks✔\uD83D\uDCCBHahahaha\uD83D\uDE02\uD83D\uDE02!");
            }
        });
        api.addMessageCreateListener(event -> {
        if (event.getMessageContent().equalsIgnoreCase("oh you smoke?")) {
        event.getChannel().sendMessage("whats your favorite strain? personally i like kush mountain yellow sunshine luster with a nice 40% thc content really gets you up in the clouds ayy yLMAO speaking of clouds i sure can blow some real fatties, i can get zooted in one blow of this shit its not even funny, i also like wax thats pretty nice too for when you just want a blast into the astral plain AYYY LMAO My blessed holy rose quartz dab pin does the trick this baby can be heated up to 1000 degrees without losing shape, whats your dab rig look like? if its not as good as mine thats fine youknow three SMOKEKATEERS style ayy lmao one for all and all for one, you can come over sometime and hit the zooter 9000 (the name of my bong) the tube is 5 ft long thats mostly how i get those weather baloon type beats, ahahaha can you do any tricks? i can do a triple hoop ghost projection (where you blow three O's then ghost them) its pretty cool, one time i kissed one girlfriends (i have multiple (by the way) im a pimp) and we blew smoke into eachothers mouths and it was so hot! then she gave me the DRAGONS BREATH (a secret technique where you give me head with WEED smoke in your mouth) anyways what about yourself? do you smoke?");
        }
        });
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("hoe tao")) {
                event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/514993579048042509/814933298530484224/who_tao_more_like_ratchet_ass_bitch.png");
            }
        });
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("jojo")) {
                event.getChannel().sendMessage(":bangbang::bangbang::bangbang:HOLY FUCKING SHIT:bangbang::bangbang::bangbang:IS THAT A MOTHER FUCKING JOJO REFERENCE??????!!!!!!!!!!11!1!1!1!1!1!1! :scream::scream::scream::scream::scream::scream::scream:JOJO IS THE BEST FUCKING ANIME:fire::fire::fire::fire::100::100::100::100:JOSUKE IS SO BADASS:sunglasses::sunglasses::sunglasses::sunglasses::punch::punch::punch:Oh you're approaching me:question::question::question::question::question::question:But it was me, Dio:bangbang::bangbang::bangbang::bangbang::bangbang::bangbang::joy::rofl::joy::rofl::joy::rofl::joy:NIGERUNDAYOOOO:man_running::man_running::man_running:NIGERUNDAYOOOO:man_running::man_running::man_running:SHIZA! SHIZA! SHIZAAAAAA!!!!!!!!!!:heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign::heavy_plus_sign:YARE YARE YARE YARE YARE YARE YARE YARE YARE YARE YARE YARE YARE  :call_me_tone5::call_me_tone5::call_me_tone5::call_me_tone5::call_me_tone5:LERO LERO LERO LERO LERO LERO LERO LERO  :cherries::cherries::cherries::cherries::cherries::cherries:ORAORAORAORAORAORAORAORAORA:weary::weary::weary::weary::weary:MUDAMUDAMUDAMUDAMUDAMUDA:face_with_symbols_over_mouth::rage::face_with_symbols_over_mouth::rage::face_with_symbols_over_mouth::rage::face_with_symbols_over_mouth::face_with_symbols_over_mouth::rage::face_with_symbols_over_mouth::face_with_symbols_over_mouth::rage:WRYYYYYYYYYYYYYYYYYYPOLNAREFFUUUUUUU:flag_cp::flag_cp::flag_cp::flag_cp:\n" +
                        "DORARARARARARARARARARARARARARARA:turtle::turtle::turtle::turtle::turtle::turtle:Yo Angelo!:moyai:Yo Angelo!:moyai:Yo Angelo!:moyai::moyai:Yo Angelo!:moyai::moyai::moyai::moyai::moyai::moyai:");
            }
        });
        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
