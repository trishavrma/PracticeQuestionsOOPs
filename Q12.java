/*12. Design a payment processing system.
Create an abstract class Payment with an abstract method pay(double amount).
Create subclasses:
 CreditCardPayment
 UPIPayment
 NetBankingPayment
Each subclass should implement the pay() method differently.*/

abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of Rs " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of Rs " + amount);
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing net banking payment of Rs " + amount);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();
        Payment netBanking = new NetBankingPayment();

        creditCard.pay(100.50);
        upi.pay(25.00);
        netBanking.pay(500.75);
    }
}

