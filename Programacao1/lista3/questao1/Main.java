import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Gerente g = new Gerente();
        double salarioGerente = g.calcularBonus(g.getSalario()) + g.getSalario();

        Diretor d = new Diretor();

        System.out.println("Nome do diretor: ");
        d.setNome(ler.next());
        System.out.println("Quantas ações ele tem: ");
        d.setAcoes(ler.nextInt());

        System.out.println("Nome do gerente: ");
        g.setNome(ler.next());
        System.out.println("Qual seu departamento: ");
        g.setDepartamento(ler.next());

        System.out.println("Diretor(a) é " + d.getNome());
        System.out.print("Recebe R$" + d.getSalario());
        System.out.println(" e tem " + d.getAcoes() + " ações na empresa");

        System.out.println("Gerente é " + g.getNome());
        System.out.print("Recebe R$" + salarioGerente);
        System.out.print(" e é do departamento " + g.getDepartamento());
    }
}