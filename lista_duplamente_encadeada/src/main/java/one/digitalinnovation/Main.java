package one.digitalinnovation;

public class Main {
    public static void main(String[] args) throws Exception{
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada();

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");

        System.out.println("Tamanho da lista: " + minhaLista.size());

        minhaLista.remove(5); // Removeu o 6.
        System.out.println(minhaLista);

        minhaLista.add(5, "99");

        System.out.println(minhaLista.get(5));

    }
}