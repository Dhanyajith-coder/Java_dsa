//package Recursion;

public class countDown {
    static void cDown(int n){
        if(n==0){
        return;}
    System.out.println(n);
    cDown(n-1);
    }
    public static void main(String[] args){
        cDown(5);
    }
}
