package SucessorAntecessor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;
        
        System.out.println("Sucessor: " + sucessor);
        System.out.print("Antecessor: " + antecessor);
    }
}
