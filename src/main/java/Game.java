import java.util.ArrayList;

public class Game {

    private String word;

    private int numGuesses = 0;

    public Game(String customized_word){
        this.word = customized_word;
    }

    public Game(){
        word = WordGenerator.generateWord();
    }


    public ArrayList<Integer> compare (String guess){

        numGuesses ++;

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i<guess.length(); i++){
            if (word.indexOf(guess.charAt(i)) != -1){
                if(guess.charAt(i) == word.charAt(i)){
                    result.add(2);
                }
                else{
                    result.add(1);
                }
            }
            else{
                result.add(0);
            }
        }
        return result;
    }

    public String getWord(){return this.word;}

    public int getNumGuesses(){return this.numGuesses;}

    public void setWord(String word)
    {
        this.word = word;
    }
}
