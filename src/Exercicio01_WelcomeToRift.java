import java.util.Scanner;

/**
 * Exercicio 1 - Boas-vindas ao Rift
 * 
 * Peça ao usuário que digite seu nome e sua lane favorita.
 * Mostre uma mensagem personalizada de boas-vindas, como:
 * 
 * Exemplo de saída:
 * "Bem-vindo, Luan! Prepare-se para dominar a mid lane!"
 * 
 * Entrada:
 * - Nome do jogador (String)
 * - Lane favorita (String)
 * 
 * Saída:
 * - Mensagem personalizada no console
 */

public class Exercicio01_WelcomeToRift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeJogador, laneFavorita;

        System.out.println("Digite o seu nome de invocador:");
        nomeJogador = scanner.nextLine();

        System.out.println("Digite a sua lane favorita:");
        laneFavorita = scanner.nextLine();

        System.out.println("Bem vindo, " + nomeJogador + "! Prepare-se para dominar a " + laneFavorita + "!");

        scanner.close();
    }
}
