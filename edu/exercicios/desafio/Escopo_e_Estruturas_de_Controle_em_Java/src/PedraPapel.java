import java.util.Scanner;

public class PedraPapel {
    public static void main(String[] args) {
      	Scanner scanner = new Scanner(System.in);
    	int rounds = scanner.nextInt();
    	String player1, player2;
        
    	for (int i = 0; i < rounds; i++) {
    		player1 = scanner.next().toLowerCase();
    		player2 = scanner.next().toLowerCase();
            if(player1.equals("ataque") && player2.equals(player1)) {
                System.out.println("Aniquilacao mutua");
            } else if (player1.equals("papel") && player2.equals(player1)) {
                System.out.println("Ambos venceram");
            } else if (player1.equals("pedra") && player2.equals(player1)) {
                System.out.println("Sem ganhador");
            } else if (player1.equals("ataque") && !player2.equals("ataque")) {
                System.out.println("Jogador 1 venceu");
            } else if (player1.equals("pedra") && player2.equals("papel")){
                System.out.println("Jogador 1 venceu");
            } else {
                System.out.println("Jogador 2 venceu");
            }
    	}
        scanner.close();
    }
}
