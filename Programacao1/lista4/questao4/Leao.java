public class Leao extends Animal {
    private String pele;

    // Construtor da classe Mamifero
    public Leao(String subclasse, String locomocao, String pele) {
        super(subclasse, locomocao);
        this.pele = pele;
    }

    public String getPele() {
        return pele;
    }

    public void exibirInformacoes() {
        System.out.println("Sub-classe: " + getSubClasse() + "\n" + "Método de locomoção: " + getLocomocao() +
                "\n" + "Tem na pele: " + getPele());
    }
}