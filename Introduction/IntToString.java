/*You are given an integer n , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between -100 to 100 inclusive.
 
Sample Input  100
Sample Output Good Job
*/

import java.io.*;
import java.util.*;

public class IntToString{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        String s=Integer.toString(n);  
        System.out.println("Good job");
        }
        catch(Exception e){
            System.out.println("Wrong answer");
        }
       
    }
}