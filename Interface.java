public class Interface {
    public static void main(String[] args) {
        Phonepe p=new Phonepe();
        p.sendMoneyViacontact(450);
       // System.out.println();
    }


    
}
interface UPIInterface{

    String sendMoneyViacontact(float amount);
     String sendMoneyViaBankAccount(float amount);
      String sendMoneyViaUpiId(float amount);

}
interface InternationalInterface{
    String sendMoneytoforiegnBank(float amount);
}


class Phonepe implements UPIInterface{
         public String sendMoneyViacontact(float amount){
            System.out.println("transaction successsfull via contact...");
            return "successs";


        }
        public String sendMoneyViaBankAccount(float amount){
            System.out.println("transaction successsfull via BK...");
            return "successs";
        }
        public String sendMoneyViaUpiId(float amount){
            System.out.println("transactionsuccessfull via UPI...");
            return "successs";
        }
}


class Gpay{
    public String sendMoneyViacontact(float amount){
            System.out.println("transactionsuccessfull via contact...");
            return "successs";


        }
        public String sendMoneyViaBankAccount(float amount){
            System.out.println("transactionsuccessfull via BK...");
            return "successs";
        }
        public String sendMoneyViaUpiId(float amount){
            System.out.println("transactionsuccessfull via UPI...");
            return "successs";
        }
}

class Paytm implements UPIInterface,InternationalInterface{
         public String sendMoneyViacontact(float amount){
            System.out.println("transaction successsfull via contact...");
            return "successs";


        }
        public String sendMoneyViaBankAccount(float amount){
            System.out.println("transaction successsfull via BK...");
            return "successs";
        }
        public String sendMoneyViaUpiId(float amount){
            System.out.println("transactionsuccessfull via UPI...");
            return "successs";
        }



       public String sendMoneytoforiegnBank(float amount){

System.out.println("int trnas is successs full.........");
return "success";

}
}