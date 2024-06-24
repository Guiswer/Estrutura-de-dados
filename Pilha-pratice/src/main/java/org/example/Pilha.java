package org.example;

public class Pilha<T>{

    private No<T> refAtual;

    public Pilha(){
        this.refAtual = null;
    }

    public No top(){
        return refAtual;
    }

    public void push(T valor){
        No<T> no = new No<>(valor);

        No aux = refAtual;
        refAtual = no;

        refAtual.setRefProx(aux);
    }

    public No<T> pop(){
        if(!isEmpty()){
            No<T> poped = refAtual;
            refAtual = refAtual.getRefProx();

            return poped;
        }
        return null;
    }

    public int size(){
        No aux = refAtual;
        int tamanho = 1;

        while(true){

            if(!isEmpty()){

                if(aux.getRefProx() != null){
                    aux = aux.getRefProx();
                    tamanho++;
                }
                else{
                    return tamanho;
                }

            }
            else{
                return 0;
            }
        }
    }

    public boolean isEmpty(){
        return refAtual == null ? true : false;
    }

    @Override
    public String toString() {

        No aux = refAtual;

        for(int x = 0; x < size(); x++){
            System.out.println(aux);
            aux = aux.getRefProx();
        }
        return "";
    }
}