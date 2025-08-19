package VerdadeiroOuFalso;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha dois valores 'V' para Verdadeiro ou 'F' para Falso:");

        System.out.print("Valor 1: ");
        char entrada1 = sc.next().charAt(0);

        System.out.print("Valor 2: "); 
        char entrada2 = sc.next().charAt(0);

        boolean valor1 = entrada1 == 'V' || entrada1 == 'v';
        boolean valor2 = entrada2 == 'V' || entrada2 == 'v';

        if(valor1 && valor2){
            System.out.println("Ambos os valores são Verdadeiros.");
        } else if(!valor1 && !valor2) {
            System.out.println("Ambos os valores são Falsos.");
        } else if(valor1 && !valor2) {
            System.out.println("O primeiro valor é Verdadeiro e o segundo é Falso.");
        } else {
            System.out.println("O primeiro valor é Falso e o segundo é Verdadeiro.");
        }
    }
}
        