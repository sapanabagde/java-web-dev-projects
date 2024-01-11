package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> set : studentFiles.entrySet()) {
            int grade;
            grade = CheckFileExtension(set.getValue());
            System.out.println(set.getKey() + " submitted file: " + set.getValue() + "\n \t points: " + grade + "\n");

        }
    }

    public static double Divide(int x, int y) {
        // Write code here!
        if (y==0) {
            try {
                throw new ArithmeticException("Can't divide by 0");
            } catch (ArithmeticException a) {
                a.printStackTrace();
            }
        }
        return x/y;

    }


    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int points = 0;
        if(fileName.isEmpty() || fileName == null) {
            points = -1;
            try {
                throw new ArithmeticException("file is empty or null");
            } catch (ArithmeticException a) {
                a.printStackTrace();
            }
        }
        if(fileName.contains(".java") && fileName.length() == (fileName.lastIndexOf('a') + 1)) {
            points += 1;
        }
        return points;

    }
}