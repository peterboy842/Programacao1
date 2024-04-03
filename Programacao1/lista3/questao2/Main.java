import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Smartphone s = new Smartphone();
        Televisao t = new Televisao();

        int escolha;
        int compra;
        int cadastro;
        String buyConfirm;
        String repetir;

        do {
            System.out.println("O que deseja fazer? 1 - Comprar / 2 - Cadastrar");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Qual produto deseja comprar? 1 - Televisao / 2 - Smartphone");
                    compra = ler.nextInt();

                    switch (compra) {
                        case 1:
                            if (t.getEstoque() > 0) {
                                System.out.println(
                                        "Este item custa R$" + t.getPrice() + ". Proceder com a compra? s / n");
                                buyConfirm = ler.next();

                                if (buyConfirm.equalsIgnoreCase("s")) {
                                    System.out.println("Dirija-se ao caixa, por favor");
                                    t.setEstoque(t.getEstoque() - 1);
                                    break;
                                } else if (buyConfirm.equalsIgnoreCase("n")) {
                                    System.out.println("Ok");
                                    break;
                                } else {
                                    System.out.println("Escolha uma opção válida, por favor");
                                    break;
                                }
                            } else {
                                System.out.println("Infelizmente esse item esta fora de estoque no momento");
                            }
                            break;

                        case 2:
                            if (s.getEstoque() > 0) {
                                System.out.println(
                                        "Este item custa R$" + s.getPrice() + ". Proceder com a compra? s / n");
                                buyConfirm = ler.next();

                                if (buyConfirm.equalsIgnoreCase("s")) {
                                    System.out.println("Dirija-se ao caixa, por favor");
                                    s.setEstoque(s.getEstoque() - 1);
                                    break;
                                } else if (buyConfirm.equalsIgnoreCase("n")) {
                                    System.out.println("Ok");
                                    break;
                                } else {
                                    System.out.println("Escolha uma opção válida, por favor");
                                    break;
                                }
                            } else {
                                System.out.println("Infelizmente esse item esta fora de estoque no momento");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Qual produto deseja cadastrar ? 1 - Televisão / 2 - Smartphone");
                    cadastro = ler.nextInt();

                    switch (cadastro) {
                        case 1:
                            System.out.println("Quantidade a colocar no estoque: ");
                            t.setEstoque(ler.nextInt());
                            System.out.println("Preço: ");
                            t.setPrice(ler.nextDouble());
                            System.out.println("Cadastrado com sucesso");
                            break;

                        case 2:
                            System.out.println("Quantidade a colocar no estoque: ");
                            s.setEstoque(ler.nextInt());
                            System.out.println("Preço: ");
                            s.setPrice(ler.nextDouble());
                            System.out.println("Cadastrado com sucesso");
                            break;
                    }
            }
            System.out.println("Deseja repetir? s / n");
            repetir = ler.next();
        } while (repetir.equalsIgnoreCase("s"));
    }
}