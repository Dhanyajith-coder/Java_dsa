
public class CountUp {
    public static void cUp(int n){
        if(n>5)
            return;
        System.out.println(n);
        cUp(n+1);
    } 
    public static void main(String[] args){
        cUp(1);
    }}
