public class Main {
    public static void main(String... args) {
        Game game1 = new Game("hello");
        System.out.println(game1.getWord());
        System.out.println(game1.compare("hello") + " Guess #" + game1.getNumGuesses()); //22222
        System.out.println(game1.compare("lloeh") + " Guess #" + game1.getNumGuesses()); //11111
        System.out.println(game1.compare("zxcvb") + " Guess #" + game1.getNumGuesses()); //00000
        System.out.println(game1.compare("llxyz") + " Guess #" + game1.getNumGuesses()); //11000

    }
}
