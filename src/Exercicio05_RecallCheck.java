import java.util.Scanner;

/**
 * Exercicio 6 - Recall Negado
 * 
 * Se a torre inimiga estiver vendo o jogador, ele não pode dar recall.
 * Crie uma variável booleana e use uma estrutura condicional para mostrar a
 * mensagem correta.
 * 
 * Entrada:
 * - Visão da torre (boolean)
 * 
 * Saída:
 * - Mensagem indicando se o recall é permitido ou não
 */

public class Exercicio05_RecallCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A torre está vendo voce? (responda com true/false)");
        boolean visaoTorre;
        visaoTorre = scanner.nextBoolean();

        String recallPermitido = visaoTorre == false ? "recall iniciado"
                : "se esconda, ou sai da visão da torre para dar recall!";
        System.out.println(recallPermitido);
        scanner.close();
    }

}
