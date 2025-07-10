import java.util.Scanner;

/**
 * Exercicio12_ElegibilidadeCampeonato
 *
 * Peça a idade do jogador.
 * Informe se ele pode participar do campeonato (idade >= 16).
 */

public class Exercicio12_AgeCampVerify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade para saber se você pode participar do campeonato: ");
        int idade = scanner.nextInt();
        if (idade >= 16)
            System.out.println("Pode participar!");
        else
            System.out.println("Não pode participar!");

        scanner.close();

    }
}
