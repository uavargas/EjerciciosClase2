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

        System.out.println("El resultado correcto de la operación es " + resultado +
                " ya que la operación sigue las reglas de precedencia de operadores tema visto en clase " +
                "Los paréntesis en programación tienen la máxima prioridad en la resolución de la ecuación. " +
                "La división y multiplicación se realizan de izquierda a derecha. " +
                "En el proceso de la operación, primero se evalúan los paréntesis (sumando1 + sumando2), " +
                "lo que da 3. Luego, se divide 6 / 2, lo que da 3, y finalmente se multiplica el resultado por 3, " +
                "obteniendo el valor de 9.");

        System.out.println();
        System.out.println("""
                El resultado de la calculadora tambien es correcto pero la calculadora le da un tratamiento en el
                procedimiento diferente  al que se realiza en el telefono,
                la calculadora opera de la siguiente manera la operacion.
                6/2(1+2) --> se suma primero 1+2 = 3
                6/2(3) ---> Se multiplica 2*3 = 6
                6/6 = obtenemos 1
                """);

    }
}
