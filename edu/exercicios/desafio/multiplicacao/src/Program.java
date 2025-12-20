import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, media;

        A = scanner.nextDouble() * 3.5;
        B = scanner.nextDouble() * 7.5;

        media = (A + B)/11; 

        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
        scanner.close();
    }
}