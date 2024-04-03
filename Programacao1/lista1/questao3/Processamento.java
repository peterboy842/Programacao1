import java.util.Scanner;

public class Processamento {
        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);

        public double adicao() {
                System.out.println("Primeiro número: ");
                int input = ler.nextInt();
                System.out.println("Segunso número: ");
                int secondInput = ler.nextInt();

                return calculadora.ad(input, secondInput);
        }

        public double subtracao() {
                System.out.println("Primeiro número: ");
                int input = ler.nextInt();
                System.out.println("Segundo número: ");
                int secondInput = ler.nextInt();

                return calculadora.sub(input, secondInput);
        }

        public double divisao() {
                System.out.println("Primeiro número: ");
                int input = ler.nextInt();
                System.out.println("Segundo número: ");
                int secondInput = ler.nextInt();

                return calculadora.div(input, secondInput);
        }

        public double multiplicacao() {
                System.out.println("Primeiro número: ");
                int input = ler.nextInt();
                System.out.println("Segundo número: ");
                int secondInput = ler.nextInt();

                return calculadora.mult(input, secondInput);
        }
}