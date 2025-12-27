import java.util.Scanner;

public class Mjolnir {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int tests, power;
        String name, results;

        tests = scanner.nextInt();

        for(int i = 0; i < tests; i++) {
            name = scanner.next();
            power = scanner.nextInt();
            results = name.equals("Thor") ? "Y" : "N";
            System.out.println(results);
        }

        scanner.close();
    }
}
