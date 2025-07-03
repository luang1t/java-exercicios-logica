import java.util.Scanner;

/**
 * Exercicio 8 - Chat do Time
 * 
 * Simule um chat onde o jogador pode enviar mensagens ao time até digitar
 * "sair".
 * Toda mensagem enviada deve aparecer no console com prefixo [TIME].
 * 
 * Entrada:
 * - Mensagens digitadas pelo jogador (String)
 * 
 * Saída:
 * - Repetição das mensagens com prefixo, até que "sair" seja digitado
 */

public class Exercicio08_TeamChatSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mensagensDigitadas;

        System.out.println("Digite o quanto quiser, quando quiser para digite 'Sair' ");

        do {
            mensagensDigitadas = scanner.nextLine();
            System.out.println("[TIME] " + mensagensDigitadas);

        } while (!mensagensDigitadas.equalsIgnoreCase("Sair"));

        scanner.close();

    }
}