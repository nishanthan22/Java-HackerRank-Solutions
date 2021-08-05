import java.io.*;
import java.util.*;

public class ParallelogramArea{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp=new Scanner(System.in);
        int b =inp.nextInt();
        int h =inp.nextInt();
        if(b>0 && h>0){
            System.out.println(b*h);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}