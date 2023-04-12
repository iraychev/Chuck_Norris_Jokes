import java.util.Random;

public class ChuckNorrisJoke {

    private final Random random = new Random();
    final private String[] jokesList = {
            "Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light",
            "Chuck Norris does not sleep. He waits.",
            "On the 7th day, God rested ... Chuck Norris took over.",
            "Chuck Norris can kill two stones with one bird.",
            "Chuck Norris can drown a fish.",
            "Chuck Norris once had a heart attack. His heart lost.",
            "Chuck Norris destroyed the periodic table, because Chuck Norris only recognizes the element of surprise."};

    public String getJoke() {
        int nextAdvice = random.nextInt(jokesList.length);
        return jokesList[nextAdvice];
    }
}
