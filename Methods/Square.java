/*prameters + Return

Create a method findSquare that:

accepts an integer
calculates its square
returns the result

Call it from main() and print the returned value.  */

import java.util.*;
public class Square{
    public static int findSquare(int a){
        return a*a;

    }
public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int result = findSquare(a);
    System.out.println(result);
}
}
