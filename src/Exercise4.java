/*
¿Cuánto se ha gastado Carmen?
La posibilidad de ir al cine entre semana pagando un precio reducido es una tradición en las salas de cine españolas,
lo que se conoce como El día del espectador. En algunos cines, el día del espectador suele ser los miércoles y las
entradas se reducen hasta en un 70%. La única pega es que suele ir mucha más gente...

Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 23€.
Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
* */

public class Exercise4 {
    public static void main(String[] args) {

      double valorInicial = 23;
      double valorFinal   = 12.75;
      double valorGastado =  valorInicial - valorFinal;

        System.out.printf("El valor gastado por Carmen es de %.2f €\n", valorGastado);


    }
}
