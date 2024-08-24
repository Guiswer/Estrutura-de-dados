package lista;

public class Lifo {

    private Livro topo;

    public void adiciona(Livro livro){

        if(livro.getAnterior() == null){
            livro.setAnterior(topo);
            topo = livro;
        }
        else{
            livro.setAnterior(topo);
            topo = livro;
        }
    }

    public void remove(){
        topo = topo.getAnterior();
    }

    public Livro top(){
        return topo;
    }

    public void mostraLivros(){
        Livro aux = topo;

        while (aux != null){
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
}