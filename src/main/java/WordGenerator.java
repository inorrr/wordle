import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class WordGenerator {

    private static ArrayList<String> allWords = FileReader.readFile("/Users/yinuozhao/IdeaProjects/wordle/src/main/resources/sgb-words.txt");

    public static String generateWord(){
        Random r = new Random();
        int randomIndex = r.nextInt(allWords.size());
        String randomWord = allWords.get(randomIndex);
        return randomWord;
    }
}
