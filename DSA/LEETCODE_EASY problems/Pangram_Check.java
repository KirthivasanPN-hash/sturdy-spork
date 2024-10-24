import java.util.*;
public class Pangram_Check {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);
            System.out.println(currChar);
            if (sentence.indexOf(currChar) == -1)
                System.out.println("false");
        }
        System.out.println("true");
    }
}
