import java.util.Scanner;

public class Main {
    public static void check(String s){
        String contain = ".";
        boolean ans = true;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(contain.contains(s.substring(i, i+1))){
                ans = false;
            }
            else {
                contain.concat(s.substring(i, i+1));
            }
        }
//        System.out.println(contain);
        System.out.println(ans);
    }

    public static void count(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public static String reverse(String s){
        String reversed = "";
        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
        count(s);
        check(s);
        System.out.println(reverse(s));

    }
}