package lista;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", 2019, 29.99);
        Livro l2 = new Livro("Livro 2", 2017, 15.99);
        Livro l3 = new Livro("Livro 3", 2015, 27.99);
        Livro l4 = new Livro("Livro 4", 2014, 17.99);

        Lifo lista = new Lifo();

        lista.adiciona(l1);
        lista.adiciona(l2);
        lista.adiciona(l3);
        lista.adiciona(l4);

        System.out.println("\n========================\n");
        System.out.println("Topo -> " + lista.top());

        System.out.println("\n========================\n");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();

        System.out.println("\n========================\n");
        System.out.println("Removendo primeiro livro:");

        lista.remove();

        lista.mostraLivros();

        System.out.println("\n========================\n");
        System.out.println("Topo -> " + lista.top());
    }
}