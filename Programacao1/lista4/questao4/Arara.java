public class Arara extends Animal{
    protected int qtdeOvos;


    public Arara(){}
    public Arara(String subClasse, String locomocao, int qtdOvos) {
        super(subClasse, locomocao);
        this.qtdeOvos = qtdOvos;
    }

    public String getSubclasse() {
        return subClasse;
    }
    public String getLocomocao() {
        return locomocao;
    }

    public int getQtdeOvos() {
        return qtdeOvos;
    }
}