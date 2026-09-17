package Basics;
import java.util.Scanner;
public class NumberOfSigns {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int positive =0;
        int negative =0;
        int zero=0;
        char ch;
        do{
            System.out.println("enter the number");
            int num = sc.nextInt();
            if(num>0)
            positive++ ;
        else if (num<0)
           negative++;
        else
            zero++;    
        System.out.println("Continue?(y/n)");
          ch = sc.next().charAt(0);    
        }while(ch=='y');
        System.out.println("Postive number="+ positive);
        System.out.println("Negative number="+ negative);
        System.out.println("Zero number="+ zero);

    }
}
