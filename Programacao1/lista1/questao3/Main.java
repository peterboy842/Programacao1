import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Processamento p = new Processamento();
        int loop = 0;

        while (loop == 0) {
            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Dividir dois números");
            System.out.println("4 - Multiplicar dois números");
            System.out.println("Digite um número para escolher: ");

            int escolha = ler.nextInt();

            if (escolha == 1) {
                double resposta = p.adicao();
                System.out.println("Resultado: " + resposta);
            }
            if (escolha == 2) {
                double resposta = p.subtracao();
                System.out.println("Resultado: " + resposta);
            }
            if (escolha == 3) {
                double resposta = p.divisao();
                System.out.println("Resultado: " + resposta);
            }
            if (escolha == 4) {
                double resposta = p.multiplicacao();
                System.out.println("Resultado: " + resposta);
            }

            System.out.println("Para reiniciar a calculadora, digie 0");
            loop = ler.nextInt();
        }
    }
}