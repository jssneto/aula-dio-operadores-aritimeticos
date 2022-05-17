package br.com.dio.metodos;

public class Calculadora {


        /** Metodos
         * É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita
         * uma requisição a ele.
         * São responsáveis por definir e realizar um determinado comportamento.


        Exercicio
        1 - Calcule as 4 operacoes basicas: soma, subtracao, multiplicacao e divisao.
        Sempre 2 valores devem ser passados.

         - A partir da hora do dia, informe a mensagem adequada: bom dia, boa tarde e boa noite.
         - calcule o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam.
         - Defina arbitrariamente as faixas que influenciam nos valores.*/

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }


}
