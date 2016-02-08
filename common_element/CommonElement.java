// Using Java, come up with an algorithm to identify common elements or 
// numbers between two given arrays. Do NOT use any inbuilt methods.


 +	public class CommonElementsInArray {
 +	 
 +	    public static void main(String args[]){
 +	        int[] arr1 = {4,7,3,9,2, 12, 40,32, 10};
 +	        int[] arr2 = {3,2,12,9,40,32,4};
 +	        for(int i=0;i<arr1.length;i++){
 +	            for(int j=0;j<arr2.length;j++){
 +	                if(arr1[i]==arr2[j]){
 +	                    System.out.println(arr1[i]);
 +	                }
 +	            }
 +	        }
 +	    }
 +	}
