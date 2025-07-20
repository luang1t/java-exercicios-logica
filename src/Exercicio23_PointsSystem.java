import java.util.Scanner;

/**
 * Exercicio23_PointsSystem
 *
 * Peça ao jogador a pontuação de 5 partidas.
 * Use for para somar os pontos.
 * Se a média for maior ou igual a 50, diga que passou de fase.
 */

public class Exercicio23_PointsSystem {
    public static void main(String[] args) {
        double pontuação, valorTotalDePontos = 0, mediaDePontos;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Digite a pontuaçao da partida " + (i + 1) + ":");
            pontuação = scanner.nextDouble();
            valorTotalDePontos += pontuação;
        }
        mediaDePontos = valorTotalDePontos / 5;
        if (mediaDePontos >= 50) {
            System.out.println("Passou de fase!");
        } else {
            System.out.printf("Nao passou de fase, sua média foi: %.2f\n", mediaDePontos);
        }
        scanner.close();
    }
}
