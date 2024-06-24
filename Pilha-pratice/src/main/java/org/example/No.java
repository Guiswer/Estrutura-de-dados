package org.example;

public class No<T> {

    private No<T> refProx;
    private T valor;

    public No(T valor){
        this.refProx = null;
        this.valor = valor;
    }

    public No<T> getRefProx() {
        return refProx;
    }

    public void setRefProx(No<T> refProx) {
        this.refProx = refProx;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }
}
