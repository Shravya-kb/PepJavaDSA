// QUESTION:
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.
// Input Format
// 5//A number n
// Output Format
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 

import java.util.*;

public class PatternsPrintHalfPyramid{

    public static void main(String[] args) {
        

        // write ur code here
        System.out.println("Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
// Output 
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  *
