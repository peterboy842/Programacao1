public class Produto {
    protected String peca;
    protected double price;
    protected String tipo;

    public Produto(String peca, double price, String tipo) {
        this.peca = peca;
        this.price = price;
        this.tipo = tipo;
    }

    public String getPeca() {
        return peca;
    }

    public double getPrice() {
        return price;
    }

    public String getTipo() {
        return tipo;
    }
}