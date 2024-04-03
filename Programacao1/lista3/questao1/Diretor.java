public class Diretor extends Funcionario {

    double salario = 3000;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    int acoes;
}