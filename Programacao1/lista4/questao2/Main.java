public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println(produto1.getPeca() + " " + produto1.getPrice() + " " + produto1.getTipo() + "\n" +
                produto2.getPeca() + " " + produto2.getPrice() + " " + produto2.getTipo());
    }
}