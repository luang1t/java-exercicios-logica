import java.util.Scanner;

/**
 * Exercicio25_QuizComPontuacao
 *
 * Faça 3 perguntas de sim/não ao jogador.
 * Para cada resposta correta, some pontos.
 * Ao final, mostre a pontuação total e um comentário baseado na performance.
 */

public class Exercicio25_PointsWithQuiz {
    public static void main(String[] args) {
        int respostasCorretas = 0;
        String resposta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A seguir terao 3 perguntas, responda para saber um feedback.");
        System.out.println("Jhin é um ADCarry?");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasCorretas += 1;
        } else {
            System.out.println("Errou =(!");
        }
        System.out.println("Jhin tem 4 armas?");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("nao")) {
            respostasCorretas += 1;
        } else {
            System.out.println("Errou =(!");
        }
        System.out.println("Jhin anda mancando?");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasCorretas += 1;
        } else {
            System.out.println("Errou =(!");
        }
        if (respostasCorretas == 1) {
            System.out.println("Só acertou uma!");
        } else if (respostasCorretas == 2) {
            System.out.println("Acertou duas, parabéns!");
        } else if (respostasCorretas == 3) {
            System.out.println("Acertou todas, lenda sagrada!");
        } else {
            System.out.println("Errou todas meu chefe! =(");
        }

        scanner.close();
    }
}
