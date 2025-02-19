package InterFace;


//Interface for Payment
interface PaymentGateway {
 void processPayment(double amount);
}

//Implementing the interface for different banks
class HDFC implements PaymentGateway {
 @Override
 public void processPayment(double amount) {
     System.out.println("HDFC Processing payment of ₹" + amount);
 }
}

class SBI implements PaymentGateway {
 @Override
 public void processPayment(double amount) {
     System.out.println("SBI Processing payment of ₹" + amount);
 }
}

//Main class
public class BankDriver {
 public static void main(String[] args) {
     PaymentGateway hdfc = new HDFC();
     hdfc.processPayment(5000);

     PaymentGateway sbi = new SBI();
     sbi.processPayment(8000);
 }
}


