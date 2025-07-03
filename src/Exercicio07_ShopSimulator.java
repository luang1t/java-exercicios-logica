import java.util.Scanner;

/**
 * Exercicio 7 - Simulador de Loja
 * 
 * Mostre um menu com três itens disponíveis para compra:
 * 
 * 1 - Bota (300g)
 * 2 - Espada Longa (350g)
 * 3 - Varinha Explosiva (850g)
 * 
 * Peça ao jogador que escolha um item digitando o número correspondente.
 * Mostre o item escolhido usando switch case.
 * 
 * Entrada:
 * - Número da opção escolhida (int)
 * 
 * Saída:
 * - Nome e preço do item comprado
 */

public class Exercicio07_ShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seletor;
        System.out.println(
                "Bem vindo a loja do lolzinho fela!\nOs itens disponiveis para compra:\n1 - Bota(300g)\n2 - Espada Longa(350g)\n3 - Varinha Explosiva(850g)");
        seletor = scanner.nextInt();

        switch (seletor) {
            case 1:
                System.out.println("Item comprado:\nBota 300g!");
                break;

            case 2:
                System.out.println("Item comprado:\nEspada Longa 350g!");
                break;

            case 3:
                System.out.println("Item comprado:\nVarinha Explosiva 850g!");
                break;

        }
        scanner.close();
    }
}
