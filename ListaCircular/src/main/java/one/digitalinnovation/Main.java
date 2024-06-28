package one.digitalinnovation;

public class Main{
    public static void main(String[] args) throws Exception{
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("c0");
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");

        minhaLista.remove(0);

        System.out.println(minhaLista);
        System.out.println(minhaLista.get(2));

        System.out.println("\n\nIniciando teste com (for)");
        for(int i = 0; i < 20; i++){
            System.out.println(minhaLista.get(i)); // Da a volta. (Circular)
        }
    }
}