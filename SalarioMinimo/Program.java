package SalarioMinimo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float salarioMinimo = 1293.20f;

        System.out.print("Digite o valor do seu salario: ");
        float salarioUsuario = sc.nextFloat();

        float qntdSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.printf("Quantidade de salarios minimos: %.2f", qntdSalariosMinimos);
    }
}