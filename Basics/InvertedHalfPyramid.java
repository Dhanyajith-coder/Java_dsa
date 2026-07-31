package Basics;

public class InvertedHalfPyramid {
    public static void main(String[] agrs){
        int x=4;
        for(int i=1;i<=x;i++){
            for(int j=4;i<=j;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
