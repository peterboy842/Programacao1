public class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDetalhes() {
        return "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo();
    }
}