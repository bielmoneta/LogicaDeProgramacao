package OperacaoCondicional;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        float A = sc.nextFloat();
        System.out.print("Digite o valor de B: ");
        float B = sc.nextFloat();

        if(A == B){
            float soma = A + B;
            float C = soma;
            System.out.print("O valor de C é: "+ C);
        } else {
            float multiplica = A * B;
            float C = multiplica;
            System.out.print("O valor de C é: "+ C);
        }
    }
}