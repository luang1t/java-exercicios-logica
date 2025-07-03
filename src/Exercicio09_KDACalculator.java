import java.util.Scanner;

/**
 * Exercicio 9 - KDA do Jogador
 * 
 * Peça ao jogador para informar quantas kills, deaths e assists teve em uma
 * partida.
 * Calcule e mostre o KDA com a fórmula:
 * 
 * KDA = (kills + assists) / deaths
 * 
 * Entrada:
 * - kills (int)
 * - deaths (int)
 * - assists (int)
 * 
 * Saída:
 * - KDA (double)
 */

public class Exercicio09_KDACalculator {
    public static void main(String[] args) {

        int kills, deaths, assists;
        double kda;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas kills, deaths e assistis você teve na partida para gerar o seu KDA.");

        System.out.println("Kills:");
        kills = scanner.nextInt();

        System.out.println("Deaths:");
        deaths = scanner.nextInt();

        System.out.println("Assists:");
        assists = scanner.nextInt();
        if (deaths == 0) {

            kda = kills + assists;
            System.out.println("KDA = " + kda);

        } else {

            kda = (kills + assists) / (double) deaths;
            System.out.println("KDA = " + kda);
        }
        scanner.close();
    }
}
