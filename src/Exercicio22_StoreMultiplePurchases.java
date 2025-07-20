import java.util.Scanner;

/**
 * Exercicio22_StoreMultiplePurchases
 *
 * Mostre um menu com 3 produtos com preço.
 * O jogador pode comprar até digitar 0.
 * Ao final, mostre o total gasto.
 */

public class Exercicio22_StoreMultiplePurchases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu valor total disponível");
        double carteiraTotal = scanner.nextDouble();
        int select;
        double valorGasto = 0;

        do {
            System.out.println(
                    "Selecione o que quer comprar:\n1. Bota 300g\n2. Espada Longa 350g\n3. Bastão Explosivo 850g\n0. Sair");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    if (carteiraTotal >= 300) {
                        carteiraTotal -= 300;
                        valorGasto += 300;
                        System.out.println("Adquiriu uma bota (-300g)\nValor Restante:\nR$: " + carteiraTotal);
                    } else
                        System.out.println("Gold insuficiente para comprar uma bota.");
                    break;
                case 2:
                    if (carteiraTotal >= 350) {
                        carteiraTotal -= 350;
                        valorGasto += 350;
                        System.out.println("Adquiriu uma espada longa (-350g)\nValor Restante:\nR$: " + carteiraTotal);
                    } else
                        System.out.println("Gold insuficiente para comprar uma Espada Longa");
                    break;
                case 3:
                    if (carteiraTotal >= 850) {
                        carteiraTotal -= 850;
                        valorGasto += 850;
                        System.out
                                .println("Adquiriu uma bastao explosivo -850\nValor Restante:\nR$: " + carteiraTotal);
                    } else
                        System.out.println("Gold insuficente para comprar um Bastao Explosivo.");
                    break;
                default:
                    System.out.println("Digite entre 1 e 3 para os itens ou 0 para sair do programa!");
                    break;
            }
        } while (select != 0);
        System.out.println("Saindo da loja...");
        System.out.printf("Gastou:\nR$: %.2f\n", valorGasto);
        scanner.close();
    }
}
