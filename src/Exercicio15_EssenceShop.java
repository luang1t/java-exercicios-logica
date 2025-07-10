import java.util.Scanner;

/**
 * Exercicio15_LojaDeEssencias
 *
 * Peça o valor de uma compra.
 * Se o valor for maior que 1000, aplique 10% de desconto.
 * Mostre o valor final da compra.
 */

public class Exercicio15_EssenceShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de compra:");
        double valorDeCompra = scanner.nextDouble();
        double novoValorDeCompra;
        if (valorDeCompra > 1000) {
            novoValorDeCompra = valorDeCompra - (valorDeCompra * 0.1);
            System.out.printf("Valor final:\nR$: %.2f%n", novoValorDeCompra);
        } else
            System.out.printf("Sem desconto. Valor total: %.2f%n", valorDeCompra);
        scanner.close();
    }
}
