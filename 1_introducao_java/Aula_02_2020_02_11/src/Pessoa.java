public class Pessoa {
    // Atributos e Métodos
    // Atributos -> variáveis

    // Atributos
    float altura;
    float peso;
    int idade;
    String nome; // String não é um tipo primitivo, ele é uma classe padrão do Java

    // Utilizar atributos que façam sentido para o sistema que estamos desenvolvendo

    // Métodos
    public void imprimir(){
        // Chamamos o método println do atributo "out" (que seu tipo é alguma classe) da classe System

        System.out.println("Altura: " + altura);

        if(peso > 60) {
            System.out.println("È obeso");
        } else {
            System.out.println("Peso: " + peso);
        }

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
    }

}
