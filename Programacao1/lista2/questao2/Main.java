import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Estoque e = new Estoque();

        System.out.println("Quantidade máxima em estoque: ");
        e.setQtdMax(ler.nextInt());
        System.out.println("Quantidade mínima em estoque: ");
        e.setQtdMin(ler.nextInt());
        System.out.println("Quantidade atual: ");
        e.setQtdAtual(ler.nextInt());

        double media = e.qtdMedia(e.getQtdMax(), e.getQtdMin());

        if (e.getQtdAtual() >= media) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}