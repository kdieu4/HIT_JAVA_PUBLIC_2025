import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A: ");
            int a = sc.nextInt();
            System.out.println("Enter B: ");
            int b = sc.nextInt();

            int c = a/b;
            System.out.println("a/b = " + c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Không thể chia cho không...!");
        }

    }
}