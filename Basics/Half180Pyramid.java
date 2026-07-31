package Basics;

public class Half180Pyramid {
    public static void main(String[] agrs){
        int x=4;
        //outer loop
        for(int i=1;i<=x;i++){
            //inner loop --> for space
            for(int j=1;j<=x-i;j++){
              System.out.print(" ");
            }
            //one more inner loop for star , j's scope is only inside the {} braces so i can use j again .
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();

        }

    }
}
