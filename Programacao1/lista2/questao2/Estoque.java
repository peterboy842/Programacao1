public class Estoque {
    private double qtdMax;
    private double qtdMin;
    private double qtdAtual;

    public double getQtdMax() {
        return qtdMax;
    }
    public void setQtdMax(double qtdMax) {
        this.qtdMax = qtdMax;
    }
    public double getQtdMin() {
        return qtdMin;
    }
    public void setQtdMin(double qtdMin) {
        this.qtdMin = qtdMin;
    }
    public double getQtdAtual() {
        return qtdAtual;
    }
    public void setQtdAtual(double qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    public double qtdMedia(double qtdMax, double qtdMin) {
        return (qtdMax + qtdMin)/2;
    }
}