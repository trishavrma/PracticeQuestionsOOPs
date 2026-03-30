/*10.Create an interface Bank with method getInterestRate(). Create classes SBI,
HDFC, and ICICI that implement the interface and return different interest rates.
Write a Java program to display the interest rate of each bank.*/

interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() {
        return 8.4f;
    }
}

class HDFC implements Bank {
    public float getInterestRate() {
        return 7.3f;
    }
}

class ICICI implements Bank {
    public float getInterestRate() {
        return 9.7f;
    }
}

public class Q10 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        ICICI icici = new ICICI();
        System.out.println("Interest Rate of SBI: " + sbi.getInterestRate() + "%");
        System.out.println("Interest Rate of HDFC: " + hdfc.getInterestRate() + "%");
        System.out.println("Interest Rate of ICICI: " + icici.getInterestRate() + "%");
    }
}
