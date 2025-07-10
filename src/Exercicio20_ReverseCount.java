/**
 * Exercicio20_ContadorReverso
 *
 * Faça uma contagem regressiva de 10 até 0 com while.
 */

public class Exercicio20_ReverseCount {
    public static void main(String[] args) {
        int contagemRegressiva = 10;
        while (contagemRegressiva >= 0) {
            System.out.println("[" + contagemRegressiva + "] Contagem Regressiva!");
            contagemRegressiva--;
        }
    }
}
