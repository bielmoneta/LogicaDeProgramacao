import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double soma = (a + b);
        System.out.print("\nA soma de A + B é igual a: " + soma);

        if(soma < c){
            System.out.println("\nA soma de A + B é menor do que C");
        } else{
            System.out.println("\nA soma é maior do que C");
        }
    }
}