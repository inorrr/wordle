import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public static ArrayList<String> readFile(String pathname){
        ArrayList<String> result = new ArrayList<String>();
        try {
            File words = new File(pathname);
            Scanner scnr = new Scanner(words);
            int lineNumber = 1;
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                result.add(line);
                lineNumber++;
            }
            return result;
        }catch (Exception FileNotFoundException){
            return result;
        }
    }

}
