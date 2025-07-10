import java.util.Scanner;

/**
 * Exercicio17_RepetidorDeMensagem
 *
 * Peça uma mensagem ao jogador.
 * Imprima a mensagem 5 vezes com while.
 */

public class Exercicio17_MessageRepeater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma mensagem");
        String mensagem = scanner.nextLine();
        int contador = 1;
        while (contador <= 5) {
            System.out.println("[" + contador + "] " + mensagem);
            contador++;
        }
        scanner.close();
    }
}