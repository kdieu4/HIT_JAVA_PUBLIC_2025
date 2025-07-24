import java.util.Scanner;

public class Bai3 {

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String input = sc.nextLine().trim();

        if(isPalindrome(input)){
            System.out.println("Chuỗi đối xứng!");
        }
        else{
            System.out.println("Chuỗi không đối xứng!");
        }

    }
}
