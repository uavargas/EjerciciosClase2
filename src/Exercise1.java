/*
En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Explique por que la otra calculadora genera un resultado diferente.
* */

public class Exercise1 {
    public static void main(String[] args) {
        //Declaracion de variables e inicializacion de Valores de la ecuacion "6 / 2 ( 1 + 2 )"

        int dividendo = 6;
        int divisor   = 2;
        int sumando1  = 1;
        int sumando2  = 2;

        int resultado = dividendo / divisor * (sumando1 + sumando2);

        System.out.println(resultado);

    }
}
