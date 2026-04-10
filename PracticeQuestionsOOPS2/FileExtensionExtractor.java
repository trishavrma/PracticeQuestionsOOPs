import java.util.*;
class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        int index = file.lastIndexOf('.');
        System.out.println(file.substring(index+1));
    }
}