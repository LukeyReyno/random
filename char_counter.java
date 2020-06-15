// Purpose: Counts the letters, spaces, and other characters in an input strin 

import java.util.*;

public class char_counter {
    static boolean is_alpha(char a) {
        int ord = (int) a;
        if ((ord >= 65 && ord <= 90) || (ord >= 97 && ord <= 122)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean is_num(char n) {
        int ord = (int) n;
        if (ord >= 48 && ord <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int letters = 0;
        int nums = 0;
        int spaces = 0;
        int others = 0;

        Scanner scan = new Scanner(System.in); //create a scanner
        String input = scan.nextLine(); //create an array out of the entire input line split by spaces
        for (char letter : input.toCharArray()) { //iterate through a string (turned into array)
            if (is_alpha(letter) == true) {
                ++letters;
                continue;
            } else if (is_num(letter) == true) {
                ++nums;
                continue;
            } else if (letter == ' ') {
                ++spaces;
                continue;
            } else {
                ++others;
            }
        }
        System.out.println("The Input String is: " + input);
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + nums);
        System.out.println("Spaces: " + spaces);
        System.out.println("Others: " + others);
        
        /* Tests for is_alpha method
        
        System.out.print(input);
        System.out.println(is_alpha('A')); // True
        System.out.println(is_alpha('Z'));
        System.out.println(is_alpha('a'));
        System.out.println(is_alpha('z'));
        System.out.println(is_alpha('G'));
        System.out.println(is_alpha('g'));
        System.out.println(is_alpha('-')); // False
        System.out.println(is_alpha('~'));
        System.out.println(is_alpha(' ')); */
    }
}