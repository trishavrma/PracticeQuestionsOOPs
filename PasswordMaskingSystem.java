import java.util.*;
class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        int len = pass.length();
        String masked = "";
        for(int i=0;i<len-2;i++) masked += "*";
        masked += pass.substring(len-2);
        System.out.println(masked);
    }
}