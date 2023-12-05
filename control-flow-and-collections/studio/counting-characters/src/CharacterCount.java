import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
String phrase = "If the product of two terms is zero then common sense says at least one of the " +
        "two terms has to be zero to start with. So if you move all the terms over to one side," +
        " you can put the quadratics into a form that can be factored allowing that side of the " +
        "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";//the Sting to count

        HashMap<Character, Integer> countMap = new HashMap<>(); // create a HashMap to store the character and its count

        // loop through the string one character at a time
        for (int i = 0; i < phrase.length(); i++) {
            char count = phrase.charAt(i); // get the current character

            // store and/or update the count for the current character

            if (countMap.containsKey(count)) { // if the character is already in the map
                countMap.put(count, countMap.get(count) + 1); // increment its count by one
            } else { // if the character is not in the map
                countMap.put(count, 1); // set its count to one
            }
        }
// loop through the map to print the results
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // print one character and its count per line
        }

    }
}
