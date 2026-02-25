public class main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada listaDupla = new ListaDuplamenteEncadeada<>();
    
        listaDupla.add(1);
        listaDupla.add(2);
        listaDupla.add(3);

        listaDupla.add(2, 5);

        System.out.println(listaDupla);
        
    
    }

}
