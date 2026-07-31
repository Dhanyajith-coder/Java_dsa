package Basics;

public class HollowRectangle {
    public static void main(String[] args){
        int x=4;
        int y=5;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(i==1 || i==x || j==1|| j==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
