import java.util.Scanner;

/**
 * Exercicio24_DamageCalculator
 *
 * Em um loop, o jogador digita o dano de cada hit.
 * Pare quando digitar -1.
 * Mostre o total de dano e a média.
 */

public class Exercicio24_DamageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeHits = 0;
        Double danoPorHit, totalDano = 0.0, mediaDano;

        do {
            System.out.println("Digite o dano causado nesse hit, se desejar ver a média de dano causado digite '-1':");
            danoPorHit = scanner.nextDouble();
            if (danoPorHit != -1) {
                totalDano += danoPorHit;
                numeroDeHits++;
            }

        } while (danoPorHit != -1);
        if (numeroDeHits > 0) {
            mediaDano = totalDano / numeroDeHits;
            System.out.printf("Dano total causado foi de: %.2f\n", totalDano);
            System.out.printf("A média de dano causado foi de: %.2f\n", mediaDano);
        }
        scanner.close();
    }
}
