public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();
        Arara arara2 = new Arara("Ave", "Asas", 5);

        leao.exibirInformacoes();

        // Exibir as informações do mamífero
        System.out.println("Informações da Arara:");
        System.out.println(arara.getSubclasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdeOvos());

        System.out.println("Informações da Arara:");
        System.out.println(arara2.getSubclasse());
        System.out.println(arara2.getLocomocao());
        System.out.println(arara2.getQtdeOvos());
    }
}