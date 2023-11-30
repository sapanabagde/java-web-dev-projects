package org.launchcode;
import java.util.Scanner;

public class String {

    public static void main(java.lang.String[] args) {
        java.lang.String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Word to Search in String : ");
        java.lang.String word = input.nextLine();

            sentence = sentence.toLowerCase();
             word = word.toLowerCase();

        if (sentence.contains(word)) {
            System.out.println("True");
            Integer index = sentence.indexOf(word);
            Integer length = word.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            java.lang.String modifiedSentence = sentence.replace(word, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("False");
        }
    }

}



