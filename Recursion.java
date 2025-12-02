public class Recursion{
    public static void main(String[] args) {
        System.out.println("sum of n natural numbers:" + sum(10000));
    }
    public  static int sum(int n){
        if(n==1){
            return 1;

        }
         return n+sum(n-1);
    }
    
}
