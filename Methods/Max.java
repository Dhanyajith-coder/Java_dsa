public class Max
 {
    public static int findMax(int a , int b){
        if(a>b)
            return a;
        
        else 
            return b;
    }
    public static void main(String[] args){
        System.out.println(findMax(2,3));
    }
}
