package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static boolean isVowel(char c){
       String lowerCase = Character.toString(c);
       return (lowerCase.equals("a") || lowerCase.equals("e") || lowerCase.equals("i") || lowerCase.equals("o") || lowerCase.equals("u"));
    }
    public static int countVowel(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String input = sc.nextLine();

        int count = countVowel(input);
        System.out.println("Số nguyên âm: " + count);
    }
}
