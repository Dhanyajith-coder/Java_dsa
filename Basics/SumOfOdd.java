package Basics;

import java.util.*;
public class SumOfOdd {
    public static void main(String[] args ){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number of elements that need to be added");
           int n= sc.nextInt();
           int sum=0;
           for(int i=0;i<=n;i++){
            if(n%2!=0){
                sum +=i;
            }
           }
           System.out.println("The sum is " + sum);
           sc.close();
    }
}
