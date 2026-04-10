import java.util.*;
class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b))
            System.out.println("Case-sensitive match");
        else
            System.out.println("Not equal (case-sensitive)");
        if(a.equalsIgnoreCase(b))
            System.out.println("Case-insensitive match");
        else
            System.out.println("Not equal (case-insensitive)");
    }
}