public class Bai5_BTTL {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong so 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int sumEvenFor = 0;
        for (int i = 1; i <= 100; i += 2) {
            sumEvenFor += i;
        }
        System.out.println("Tong cac so chan tu 1 den 100 (for): " + sumEvenFor);

        int sumEvenWhile = 0;
        int i = 2;
        while (i <= 100) {
            sumEvenWhile += i;
            i += 2;
        }
        System.out.println("Tong cac so chan tu 1 den 100 (while): " + sumEvenWhile);
    }
}