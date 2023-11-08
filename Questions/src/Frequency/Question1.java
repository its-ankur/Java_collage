package Frequency;
import java.util.Scanner;
import java.util.HashMap;

public class Question1 {
    public static char findFirstUniqueChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        char firstUnique = findFirstUniqueChar(input);
        if (firstUnique != '\0') {
            System.out.println("The first unique character is: " + firstUnique);
        } else {
            System.out.println("No unique character.");
        }
    }
}
