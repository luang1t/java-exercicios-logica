import java.util.Scanner;

/**
 * Exercicio 10 - Loop de Partidas
 * 
 * Peça ao jogador quantas partidas ele jogou hoje.
 * Em seguida, peça a quantidade de kills de cada partida.
 * Calcule a média de kills por partida ao final.
 * 
 * Entrada:
 * - Número de partidas (int)
 * - Kills de cada partida (int)
 * 
 * Saída:
 * - Média de kills por partida (double)
 */

public class Exercicio10_MatchKillAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPartidas, killsPorPartida = 02, somaKillsPorPartida = 0;
        double mediaKillsPorPartida;

        System.out.println("Digite quantas partidas você jogou:");
        numeroPartidas = scanner.nextInt();

        for (int i = 0; i < numeroPartidas; i++) {

            System.out.println("Quantas players você matou na " + (i + 1) + "° partida:");
            killsPorPartida = scanner.nextInt();
            somaKillsPorPartida += killsPorPartida;
        }

        mediaKillsPorPartida = (double) somaKillsPorPartida / numeroPartidas;
        System.out
                .println("Sua média de Kills nas ultimas " + numeroPartidas + " partidas é de " + mediaKillsPorPartida);

        scanner.close();
    }
}
