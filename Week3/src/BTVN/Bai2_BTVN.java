package BTVN;

import java.util.Scanner;

public class Bai2_BTVN {

     public static boolean isPalindrome(String str) {
         String reverse = "";
         for (int i = str.length() - 1; i >= 0; i--) {
             reverse = reverse + str.charAt(i);
         }
         return str.equalsIgnoreCase(reverse);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi ký tự bất kỳ: ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println(str.toUpperCase());
            System.out.println("Chuỗi đối xứng");
        }
        else{
            System.out.println(str.toLowerCase());
            System.out.println("Chuỗi không đối xứng!");
        }
    }
}
