import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Secretaria s = new Secretaria();
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome: ");
        String aluno = ler.next();

        System.out.println("Primeira nota: ");
        double nota1 = ler.nextInt();
        System.out.println("Segunda nota: ");
        double nota2 = ler.nextInt();
        System.out.println("Terceira nota: ");
        double nota3 = ler.nextInt();

        double media = s.media(nota1, nota2, nota3);
        System.out.println("Sua média é: " + media);

        if (s.media(nota1, nota2, nota3) >= 7.0) {
            System.out.println("Aprovado.");
        } else if (s.media(nota1, nota2, nota3) < 70) {
            System.out.println("Reprovado.");
        }
    }
}