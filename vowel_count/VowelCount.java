// VOWEL COUNT
// LANGUAGE: JAVA

// Create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm, the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 8
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3
public class{
public int[] vowelCount(String x) {
    int[] res = new int[5];
    for (int i=0; i<x.length(); i++) {
	char ch = x.charAt(i);
	if (ch == 'a') {
	    res[0]++;
	} else if (ch == 'e') {
	    res[1]++;
	} else if (ch == 'i') {
	    res[2]++;
	} else if (ch == 'o') {
	    res[3]++;
	} else if (ch == 'u') {
	    res[4]++;
	}
    }
    return res;
  }
}