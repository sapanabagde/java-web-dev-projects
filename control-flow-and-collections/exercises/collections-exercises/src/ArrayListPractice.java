import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int total = sumEven(list);
        System.out.println("The sum of all the even numbers in the list is " + total);

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        getStringList(planets, numChars);

    }

    private static void getStringList(ArrayList<String> planets, int numChars) {
        for (String word : planets) {
             // Check if the word has exactly 5 letters
            if (word.length() == numChars) {
                // Print it out
                System.out.println(word);
            }
        }
    }

    private static int sumEven(ArrayList<Integer> list) {
        int total = 0;
        for (int integer : list) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

}
