import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        try {
            System.out.print("Insert the starter number: ");
            start = scanner.nextInt();
            System.out.print("Insert the end number: ");
            end = scanner.nextInt();
            try {
                counter(start, end);
            } catch (ParametrosInvalidosException e) {
                System.err.println(e.getMessage());
            }    
        } catch (java.util.InputMismatchException e) {
            System.err.println("Insert whole numbers");
        }
        scanner.close();
    }
    static void counter(int start, int end) throws ParametrosInvalidosException {
        if(end < start) throw new ParametrosInvalidosException();
        else {
            int value = end - start;
            for(int i = 0; i < value; i++) {
                System.out.printf("Imprimindo o numero %d\n", i+1);
            }
        }
    }
}
