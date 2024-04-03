public class Main {
    public static void main(String[] args) {
        Professor Fernanda = new Professor("Fernanda", 47, 2200);
        Aluno Ana = new Aluno("Ana", 19, 202321151);
        Aluno Pedro = new Aluno("Pedro", 18, 202321152);
        Aluno Rafael = new Aluno("Rafael", 21, 202015148);

        System.out.println("A professora " + Fernanda.getNome() + ", da aula a esses três alunos: " +
                "\n" + Ana.getNome() + " " + Ana.getIdade() + " " + Ana.getMatricula() +
                "\n" + Pedro.getNome() + " " + Pedro.getIdade() + " " + Pedro.getMatricula() +
                "\n" + Rafael.getNome() + " " + Rafael.getIdade() + " " + Rafael.getMatricula());
    }
}