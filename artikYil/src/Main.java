import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil, kalan, kalan100, kalan400;


        Scanner input = new Scanner(System.in);
        System.out.println("Yili giriniz: ");
        yil = input.nextInt();

        kalan = yil % 4;
        kalan100 = yil % 100;
        kalan400 = yil % 400;


        if (kalan == 0) {
            if (kalan100 == 0) {
                if (kalan400 == 0) {
                    System.out.println("Artık Yil!");
                } else {
                    System.out.println("Artik yil degil!");
                }
            } else {
                System.out.println("Artik Yil!");
            }
        } else {
            System.out.println("Artik yil degil.");
        }


    }

}
