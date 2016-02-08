// Write a java algorithm to reverse a string, and print it's output
// For instance, "CodeNinja" returns: 'ajniNedoC'

public class ReverseString{
	//Code goes here:
private static String myReverse(String str) {
    String reverse = "";
    int length = str.length();
    for( int i = length - 1 ; i >= 0 ; i-- ) {
       reverse = reverse + str.charAt(i);
    }
    return reverse;
}
}