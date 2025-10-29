public class Stack {
    private Node top;
    private int size;

    public Stack () {                        //*Criando uma pilha vazia 
        this.top = null;
        this.size = 0;
    }

    public void push (int item_parm) {       //* Empilhando item
        Node x = new Node(item_parm);
        x.next = this.top;
        this.top = x;
        this.size++;
    }

    public boolean isEmpty () {              //* Verificando se a pilha está vazia
        return this.top == null;
    }

    public int size () {                     //* Retornando tamanho da pilha
        return this.size;
    }

    public int pop () {                     //* Desempilhando item
        if (this.isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        int item = this.top.item;
        this.top = this.top.next;
        this.size--;
        return item;
    }

    public int top () {                     //* Pegando elemento do topo
        if (this.isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return this.top.item;
    }

}

class Node {
    public int item;
    public Node next;

    public Node (int item) {
        this.item = item;
        this.next = null;
    }
}