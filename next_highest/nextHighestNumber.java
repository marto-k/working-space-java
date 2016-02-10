// Given a number, find the next higher number using only the digits 
//in the given number. For example if the given number is 1508, 
//the next higher number with same digits is 1805.
import java.util.Arrays;

public class HigherNumber{



	    
	public static void main(String [] Args){
		int num = 1508;
		char[] x = String.valueOf(num).toCharArray();

		Arrays.sort(x);

		for (int i = x.length-1;i>=0; i--){
		    System.out.print (x[i]);
		    
		    }
		    
		}
		    

}