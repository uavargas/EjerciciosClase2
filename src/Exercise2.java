/*
¿Ves algún error en el precio?
En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen.
 Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
 ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.

* */


public class Exercise2 {
    public static void main(String[] args) {

        double porcion100Gramos = 5.95;
        double precioPorKilo = 5.95 / 100 * 1000;

        System.out.printf("Si el precio de 100 gr de Pernil Ibérico D'Engreix Llen Azuaga.\n" +
                "cuesta %.2f €, entonces el valor correcto por Kilo es de %.2f €.\n", porcion100Gramos, precioPorKilo);



    }
}
