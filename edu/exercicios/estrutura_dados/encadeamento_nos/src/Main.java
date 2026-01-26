public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNO(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNO(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximoNO(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println("-------------------------Teste------------------------");
        System.out.println(no1 + "  " + no1.getProximoNo());
        System.out.println(no2 + "  " + no2.getProximoNo());
        System.out.println(no3 + "  " + no3.getProximoNo());
        System.out.println(no4 + "  " + no4.getProximoNo());
    }
}
