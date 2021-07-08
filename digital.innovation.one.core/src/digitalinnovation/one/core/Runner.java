package digitalinnovation.one.core;

import digital.innovation.one.util.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        int a = 10;
        int b = 5;

        int valor = calculadora1.div(a,b);
        System.out.println(valor);
        valor = calculadora1.sum(a,b);
        System.out.println(valor);
        valor = calculadora1.sub(a,b);
        System.out.println(valor);
        valor = calculadora1.mult(a,b);
        System.out.println(valor);
    }
}
