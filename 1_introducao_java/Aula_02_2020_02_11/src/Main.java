public class Main {
    public static void main(String[] args) {
        // Todos programas vão ter essa classe que é a entrada do projeto, ela vai organizar a entrada das outras

        // Criação primeiro objeto, objeto do tipo pessoa, referenciado pela referência "jair".
        Pessoa jair = new Pessoa();

        // Atribuindo valores aos atributos da classe Pessoa
        jair.nome = "Jair";
        jair.idade = 12;
        jair.peso = 59f;
        jair.altura = 1.59f;
        // Chamar o método
        jair.imprimir();

        System.out.println();

        // Novo objeto da mesma classe
        Pessoa luiz = new Pessoa();
        luiz.nome = "josé";
        luiz.idade = 34;
        luiz.peso = 80.5f;
        luiz.altura = 1.89f;

        luiz.imprimir();

    }
}