public class Main {
    public static void main(String[] args) {
        ListaCircular<String> lista_circular = new ListaCircular<>();
    
        lista_circular.add("c0");
        lista_circular.add("c1");
        lista_circular.add("c3");
        System.out.println(lista_circular);
        lista_circular.remove(1);
        System.out.println(lista_circular);

    
    
    }
}
