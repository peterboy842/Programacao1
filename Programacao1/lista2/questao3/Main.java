import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangle t = new Triangle();

        System.out.println("Primerira medida: ");
        t.setLado1(ler.nextDouble());
        System.out.println("Segunda medida: ");
        t.setLado2(ler.nextDouble());
        System.out.println("Terceira medida: ");
        t.setLado3(ler.nextDouble());

        t.type(t.getLado1(), t.getLado2(), t.getLado3());

        System.out.println("Triângulo " + t.tipoDoTriangle);
    }
}