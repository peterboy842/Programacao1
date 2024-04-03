import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ContaCorrente c = new ContaCorrente();
        ContaPoupanca p = new ContaPoupanca();

        int escolha;
        int escolhaFiltradaCorrente;
        double depositoCorrente;
        int escolhaFiltradaPoupanca;
        double depositoPoupanca;

        System.out.println("Bem-vindo(a), insira o seu nome: ");
        String nome = ler.next();
        c.setTitular(nome);
        p.setTitular(nome);

        String repetir;
        do {
            System.out.println("Qual seu tipo de conta? 1 - Corrente / 2 - Poupança");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(
                            "O que deseja fazer? 1 - Depositar / 2 - Sacar / 3 - Usar cheque especial / 4 - Exibir dados da conta");
                    escolhaFiltradaCorrente = ler.nextInt();

                    switch (escolhaFiltradaCorrente) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar: ");
                            depositoCorrente = ler.nextDouble();
                            c.setSaldo(c.getSaldo() + depositoCorrente);
                            System.out.println("Depósito realizado com sucesso");
                            break;

                        case 2:
                            System.out.println("Insira a quantia que deseja sacar: ");
                            double quantia = c.sacar(ler.nextInt());
                            if (c.getSaldo() >= quantia) {
                                c.setSaldo(c.getSaldo() - quantia);
                                System.out.println("Saque realizado com sucesso");
                                break;
                            } else {
                                System.out.println("Saldo insuficiente, não foi possível realizar o saque");
                                break;
                            }

                        case 3:
                            System.out.println("Insira quanto de cheque especial você deseja ter acesso: ");
                            double concederChequeEspecial = ler.nextDouble();

                            if (concederChequeEspecial <= c.valorChequeEspecial) {
                                c.setValorChequeEspecial(c.valorChequeEspecial - concederChequeEspecial);
                                System.out.println("Valor concedido");
                                break;
                            } else {
                                System.out.println("Valor negado, seu acesso ao cheque especial atualmente é de R$"
                                        + c.valorChequeEspecial);
                                break;
                            }

                        case 4:
                            System.out.println(c.exibirDados());
                            break;
                    }
                    break;

                case 2:
                    System.out.println(
                            "O que deseja fazer? 1 - Depositar / 2 - Sacar / 3- Calcular rendimentos / 4 - Exibir dados da conta");
                    escolhaFiltradaPoupanca = ler.nextInt();

                    switch (escolhaFiltradaPoupanca) {
                        case 1:
                            System.out.println("Insira a quantia que deseja depositar: ");
                            depositoPoupanca = ler.nextDouble();
                            p.setSaldo(p.getSaldo() + depositoPoupanca);
                            System.out.println("Depósito realizado com sucesso");
                            break;

                        case 2:
                            System.out.println("Insira a quantia que deseja sacar: ");
                            double quantiaPoupanca = p.sacar(ler.nextInt());
                            if (p.getSaldo() >= quantiaPoupanca) {
                                p.setSaldo(p.getSaldo() - quantiaPoupanca);
                                System.out.println("Saque realizado com sucesso");
                                break;
                            } else {
                                System.out.println("Saldo insuficiente, não foi possível realizar o saque");
                                break;
                            }

                        case 3:
                            System.out.println(p.calcularRendimento());
                            break;
                        case 4:
                            System.out.println(p.exibirDados());
                    }
            }
            System.out.println("Deseja repetir? s / n");
            repetir = ler.next();
        } while (repetir.equalsIgnoreCase("s"));
    }
}