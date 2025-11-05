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

    public Stack (Stack outro) {            //* Criando pilha cópia
        Node n = outro.top;
        Stack s = new Stack();
        while (n != null) {
            s.push(n.item);
            n = n.next;
        }
        this.size = 0;
        this.top = null;

        while (!s.isEmpty()) {
            this.push(s.pop());
        }
    }

    public Stack (int num_param) {          //* Criando um construdor para inserir n numeros
        this.top = null;
        this.size = 0;

        for (int i = 1; i <= num_param; i++) {
            this.push(i);
        }
    }

    public void show() {                    //* Método para imprimir as pilhas
        Node n = this.top;

        while (n != null) {
            System.out.println(n.item);
            n = n.next;
        }
    }

    //* Comparando se duas pilhas são iguais
    public static boolean equals (Stack stack1_param, Stack stack2_param) {
        if (stack1_param.size() != stack2_param.size()) {
            return false;
        }
        else {
            Node n1 = stack1_param.top;
            Node n2 = stack2_param.top;

            while (n1 != null) {
                if (n1.item != n2.item) {
                    return false;
                }
                n1 = n1.next;
                n2 = n2.next;
            }

        }
        return true;
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