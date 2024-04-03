import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fruta f = new Fruta();
        Apple a = new Apple();

        System.out.println("Nùmero de maçãs:");
        a.setQtd(ler.nextInt());

        if (a.getQtd() < 12) {
            a.setPrice(1.30);
        }
        if (a.getQtd() >= 12) {
            a.setPrice(1);
        }

        System.out.println("R$" + f.calcularP(a.getPrice(), a.getQtd()) + " no total.");
    }
}