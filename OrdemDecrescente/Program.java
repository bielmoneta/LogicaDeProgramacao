package OrdemDecrescente;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores inteiros diferentes:");

        System.out.print("Valor 1: ");
        int valor1 = sc.nextInt();

        System.out.print("Valor 2: ");
        int valor2 = sc.nextInt();

        System.out.print("Valor 3: ");
        int valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("Maior valor: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("Maior valor: " + valor2);
        } else {
            System.out.println("Maior valor: " + valor3);
        }

        System.out.println("Ordem decrescente: ");

    }
}
