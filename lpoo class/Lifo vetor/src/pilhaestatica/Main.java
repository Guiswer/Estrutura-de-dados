package pilhaestatica;

public class Main {

    public static void main(String[] args){
        Pilha p = new Pilha();
        p.adicionar(10);
        p.adicionar(10);
        p.adicionar(10);

        p.mostrar();
        p.remover();
        p.mostrar();
    }
}