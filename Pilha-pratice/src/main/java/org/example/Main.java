package org.example;

public class Main{
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5); // Este foi "popado".


        System.out.println("O elemento \"popado\" é: " + pilha.pop()); /* O método (pop) retira o último elemento (topo
        da  pilha e o retorna. */
        System.out.println();


        System.out.println(pilha);

        System.out.println("Esse é o topo: " + pilha.top());
    }
}