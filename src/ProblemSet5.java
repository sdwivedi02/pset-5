/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */
import java.util.*;

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

    }

public class ProblemSet5 {

    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {

      if (in != null && out != null && out.length() == 4) {
            String firstTwoCharacters = out.substring(0, 2);
            String lastTwoCharacters = out.substring(2, 4);
            String surroundString = firstTwoCharacters + in +lastTwoCharacters;
            return surroundString;
        }
        return in;

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {

      if (text != null && (text.length() >= 1 && text.length() <= 10) && (n >= 1 && n <= text.length())) {
            String firstn = text.substring(0, n);
            String lastn = text.substring(text.length() - n, text.length());
            String newString = firstn + lastn;
            return newString;
        }
        return newString;

    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {

      if (text != null && text.length() % 2 == 1 && text.length() >= 3) {
            double middle = text.length() / 2;
            String middleThreeCharacters = text.substring((int)(middle - 0.5), (int)(middle + 2.5));
            return middleThreeCharacters;
        }
        return text;

    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {

       if (text != null && text.length() % 2 == 1 && target != null && target.length() == 3) {
            double middle = text.length() / 2;
            String middleThreeCharacters = text.substring((int)(middle - 0.5), (int)(middle + 2.5));
            if (middleThreeCharacters.equals(target)) {
                return true;
            }
        }
        return false;

    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {

      if (text != null && (((suffix >= 65 && suffix <= 90) || (suffix >= 97 && suffix <= 121)))) {
            int numberOfWords = 0;
            String string = Character.toString(suffix);
            String individualWords[] = text.split(" ");
            for (int i = 0; i < individualWords.length; i++) {
                if (individualWords[i].endsWith(string)) {
                    numberOfWords++;
                }
            }
            return numberOfWords;
        }
        return -1;

    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {

      if (text != null) {
            int numberOfTriplets = 0;
            for (int i = 0; i <= text.length() - 3; i++) {
                if (text.charAt(i) == text.charAt(i + 1) && text.charAt(i) == text.charAt(i + 2)) {
                    numberOfTriplets++;
                }
            }
            return numberOfTriplets;
        }
        return -1;

    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {

       if (text != null) {
            long sumOfDigits = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                    sumOfDigits += Character.getNumericValue(text.charAt(i));
                }
            }
            return sumOfDigits;
        }
        return -1;

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {

      if (text != null) {
            text += " ";
            long longestSequence = 0;
            long lengthOfSequence = 1;
            for (int i = 0; i < text.length() - 2; i++) {
                while (text.charAt(i) == text.charAt(i + 1)) {
                    lengthOfSequence += 1;
                    i++;
                }
                if (lengthOfSequence > longestSequence) {
                    longestSequence = lengthOfSequence;
                }
                lengthOfSequence = 1;
            }
            return longestSequence;
        }
        return -1;

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {

      if (a != null && b != null) {
            String output = "";
            int i;
            for (i = 0; i < a.length() && i < b.length(); i++) {
                output += a.charAt(i);
                output += b.charAt(i);
            }
            output += a.substring(i, a.length());
            output += b.substring(i, b.length());
            return output;
        }
        return null;

    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {

    }
}
}
