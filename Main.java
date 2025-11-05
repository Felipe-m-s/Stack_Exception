
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Stack a = new Stack();

        //* Primeira parte
        a.push(10);
        a.push(20);
        a.push(30);

        Stack b = new Stack(a);
        a.pop();    //* Removendo elemento do top de A
        
        System.out.println("Pilha A:");
        a.show();
        System.out.println("Pilha B:");
        b.show();

        //* Segunda parte
        System.err.println("Digite a quantidade de números a serem inseridos");
        int num = read.nextInt();
        Stack s = new Stack(num);
        System.err.println("Pilha: ");
        s.show();

        //* Terceira parte
        System.err.println(Stack.equals(a, s) ? "Pilhas Iguais!" : "Pilhas diferentes!");

        read.close();
    }
}