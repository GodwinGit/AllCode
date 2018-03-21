import java.util.HashMap;

public class Translator {

    HashMap<String, String> letters = new HashMap<String, String>();
    protected String userInput;

    public String translate(String input){
        this.userInput = input;
        this.letters.put(".-", "a");
        this.letters.put("-...", "b");
        this.letters.put("-.-.", "c");
        this.letters.put("-..", "d");
        this.letters.put(".", "e");
        this.letters.put("..-.", "f");
        this.letters.put("--.", "g");
        this.letters.put("....", "h");
        this.letters.put("..", "i");
        this.letters.put(".---", "j");
        this.letters.put("-.-", "k");
        this.letters.put(".-..", "l");
        this.letters.put("--", "m");
        this.letters.put("-.", "n");
        this.letters.put("---", "o");
        this.letters.put(".--.", "p");
        this.letters.put("--.-", "q");
        this.letters.put(".-.", "r");
        this.letters.put("...", "s");
        this.letters.put("-", "t");
        this.letters.put("..-", "u");
        this.letters.put("...-", "v");
        this.letters.put(".--", "w");
        this.letters.put("-..-", "x");
        this.letters.put("-.--", "y");
        this.letters.put("--..", "z");

        String[] wordsArray = userInput.split(" / ");
        String[][] arraysOfLetters = new String[wordsArray.length][];
        for (int i =0; i<wordsArray.length; i++){
            arraysOfLetters[i]=wordsArray[i].split(" ");
        }
        for (int i=0; i<arraysOfLetters.length; i++) {
            char[] w = new char[arraysOfLetters.length];
            System.out.println();
            for (int j=0; j<arraysOfLetters[i].length; j++) {
                System.out.print(this.letters.get(arraysOfLetters[i][j]));
            }
        }
        return "s";
    }

    public static void main(String[] args){
        Translator t = new Translator();
        t.translate(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");

    }
}
