package AnaliseDeNumero;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número:");
        float numero = sc.nextFloat();

        if(numero % 2 == 0){
            System.out.println("O número é par.");
        } else{
            System.out.println("O número é ímpar.");
        }

        if(numero > 0){
            System.out.println("O número é positivo.");
        } else if(numero < 0){
            System.out.println("O número é negativo.");
        } else{
            System.out.println("O número é zero.");
        }
    }
}
