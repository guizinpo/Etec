/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadorajava;

public class App {
     public static void main(String[] args) {
        Calculadora operacao = new Calculadora();
        System.out.println(operacao.somar(7, 3));
        System.out.println(operacao.subtracao(10, 8));
        System.out.println(operacao.multiplicacao(5, 9));
        System.out.println(operacao.divisao(10, 5));
        System.out.println(operacao.raizq(64));
        System.out.println(operacao.porcentagem(1000, 80));
        System.out.println(operacao.potencia(5, 2));
    }
}
