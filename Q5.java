/*5. Define a class employee with the following specification:
 Members are: empno of type integer, ename of type String, basic, hr and da
are of type float, netpay of type float.
 Member functions:
 Calculate() : A function to find basix+hra+da with the float return type.
 havedata(): function to accept values for empno, ename, basic, hra, da and
invoke calculate() to calculate netpay.
 dispdata(): function to display all the data members.*/

public class Q5 {
    
    int empno;
    String ename;
    float basic;
    float hra;
    float da;
    float netpay;

   
    public float Calculate() {
        return basic + hra + da;
    }

   
    public void havedata(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.netpay = Calculate(); // Invoke calculate() to set netpay
    }

    
    public void dispdata() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

   
    public static void main(String[] args) {
        Q5 emp1 = new Q5();
        emp1.havedata(101, "John Doe", 50000.0f, 15000.0f, 10000.0f);
        emp1.dispdata();
    }
}
