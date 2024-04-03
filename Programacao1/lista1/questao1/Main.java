import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        INSS i = new INSS();
        Funcionario a = new Funcionario();

        System.out.println("Nome:");
        a.nome = ler.next();
        System.out.println("Matrícula:");
        a.matricula = ler.nextInt();
        System.out.println("Salário bruto:");
        i.salarioBruto = ler.nextDouble();

        System.out.println("Funcionário: " + a.nome);
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Salário Bruto: " + i.salarioBruto);

        i.aplicarDesconto(i.salarioBruto, i.desconto);

        System.out.println("Salário Líquido: " + i.salarioLiquido);
    }
}