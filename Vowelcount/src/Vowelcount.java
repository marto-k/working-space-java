/**
 * VowelCount.java
 *
 * @author David Roazen
 *
 * Purpose: A class containing a method vowelCount(), which
 *          takes a String as a parameter and returns the
 *          number of vowels in the String. Also contains
 *          some main() test code to test the vowelCount()
 *          method.
 */

import java.util.*;

public class VowelCount {

    /**
     * main()
     *
     * The main program simply reads in a line of text
     * from the keyboard, and uses the vowelCount() method
     * to print out how many vowels it contains.
     */
    public static void main ( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = in.nextLine();

        System.out.println("Your line contains " + vowelCount(line)
                           + " vowels");
    }

    
    /**
     * vowelCount()
     *
     * Purpose: Calculates and returns the number of vowels
     *          in the line of text it is passed.
     *
     * @param   line   the line of text whose vowels to count
     * @return  the number of vowels in the String line
     */
    public static int vowelCount ( String line ) {
        int numVowels = 0;
        
        // First, create a lowercase version of line
        // to simplify our task later on:

        String lowerCaseLine = line.toLowerCase();
        
        // Then, iterate over each character in the lowercase
        // version of the line, incrementing our numVowels
        // variable every time we encounter a vowel:

        for ( int i = 0; i <= lowerCaseLine.length() - 1; ++i ) {
            char current = lowerCaseLine.charAt(i);

            if ( current == 'a' || current == 'e' || current == 'i' ||
                 current == 'o' || current == 'u' ) {

                ++numVowels;
            }
        }

        // Return the answer back to the calling method:

        return numVowels;
    }
}
