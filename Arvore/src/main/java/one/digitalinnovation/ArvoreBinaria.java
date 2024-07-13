package one.digitalinnovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){

        if(atual == null){
            return novoNo;
        }
        else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }
        else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    // In Order
    public void exibirInOrder(){
        System.out.println("\nExibido InOrdem");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual){
        if(atual != null){
            exibirInOrder(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrder(atual.getNoDir());
        }
    }

    // Pos Order
    public void exibirPosOrder(){
        System.out.println("\nExibido PosOrdem");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual){
        if(atual != null){
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());

            System.out.println(atual.getConteudo() + ", ");
        }
    }

    // Pre Order
    public void exibirPreOrder(){
        System.out.println("\nExibido PreOrdem");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ", ");

            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());
        }
    }
}