package ReajusteDeValor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: R$");
        float valor = sc.nextFloat();

        float reajuste = 0.05f; // 5% de reajuste
        float valorReajustado = valor + (valor * reajuste);

        System.out.printf("\nValor após o reajuste: R$%.2f", valorReajustado);
    }
}
