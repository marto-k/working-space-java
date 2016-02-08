// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)

public class third_largest{
public static void main(String[] args) {
    int smallest=0; int large=0; int num;
    System.out.println("enter the number");//how many number you want to enter
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    num=input.nextInt();
    smallest = num; //assume first entered number as small one
    for(int i=2;i<n;i++)// i starts from 2 because we already took one num value
        {
            num=input.nextInt();
            if(num>large)//comparing each time entered number with large one
          {
           large=num;
          }
            if(num<smallest)//comparing each time entered number with smallest one
            {
                smallest=num;
            }
        }
   System.out.println("the largest is:" + large);
   System.out.println("Smallest no is : "  + smallest);
  }
}


