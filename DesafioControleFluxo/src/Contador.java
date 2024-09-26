import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        int primeiroParametro, segundoParametro;

        System.out.println("Digite um número inteiro:");
        primeiroParametro = terminal.nextInt();

        System.out.println("Digite um número inteiro maior:");
        segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro)
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior do que o segundo");

        int contagem = segundoParametro - primeiroParametro;

        for(int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número "+x);
        }
    }

}
