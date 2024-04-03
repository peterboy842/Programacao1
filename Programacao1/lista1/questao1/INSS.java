public class INSS {
    Funcionario a = new Funcionario();

    double salarioLiquido;
    double salarioBruto;
    double desconto = 0.15;

    public double aplicarDesconto(double x, double y) {
        return salarioLiquido = x - (x*desconto);
    }
}