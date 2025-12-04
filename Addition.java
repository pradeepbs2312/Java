import java.util.*;
class Fact{
    
   public int add(int a,int b){
    return a+b;
    
    }

}
public class Addition{
    public static void main(String args[]){
        Fact fac=new Fact();
       int a,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a:");
       a=sc.nextInt();
       System.out.println("enter b:");
       b=sc.nextInt();
        System.out.println("sum:"+fac.add(a,b));
    }
}