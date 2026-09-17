import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos (N) que deseja calcular: ");
        int n = scanner.nextInt();
        
        System.out.println("\nOs primeiros " + n + " termos da sequência de Fibonacci são:");
        
        long anterior = 0;
        long atual = 1;
        
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anterior);
            
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        System.out.println();
        scanner.close();
    }
}
