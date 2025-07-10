import java.util.Scanner;

/**
 * Exercicio08_SenhaAteAcertar
 *
 * Use do while para pedir uma senha.
 * Enquanto a senha digitada for diferente de "senha123", continue pedindo.
 */

public class Exercicio18_PasswordUntilRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "senha123";
        String senhaTenativa;
        do {
            System.out.println("Digite a senha correta:");
            senhaTenativa = scanner.nextLine();
            if (!senhaTenativa.equals(senhaCorreta)) {
                System.out.println("Senha errada. Tente novamente.");
            }
        } while (!senhaTenativa.equals(senhaCorreta));
        System.out.println("Acesso permitido!");
        scanner.close();
    }
}
