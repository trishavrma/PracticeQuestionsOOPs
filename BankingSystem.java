class BankingSystem {
    int balance = 1000;
    void withdraw(int amt){
        synchronized(this){
            if(balance >= amt){
                balance -= amt;
                System.out.println("Balance deducted: " + amt);
            }
        }
    }
    public static void main(String[] args){
        BankingSystem b = new BankingSystem();
        new Thread(() -> b.withdraw(500)).start();
        new Thread(() -> b.withdraw(700)).start();
    }
}