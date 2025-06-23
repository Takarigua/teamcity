package plaindoll;

import java.util.Random;

public class Welcomer {
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }

    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }

    public String sayNeedGold() {
        return "Not enough gold";
    }

    public String saySome() {
        return "something in the way";
    }

    // Новый метод
    public String getHunterGreeting() {
        Random rand = new Random();
        String[] greetings = {
            "Welcome to the hunter's journey, brave soul!",
            "Good hunter, prepare yourself for the trials ahead.",
            "The hunter's path is never easy, but you are ready.",
            "The hunt awaits, may the blood of your enemies be your guide."
        };
        return greetings[rand.nextInt(greetings.length)];
    }
}
