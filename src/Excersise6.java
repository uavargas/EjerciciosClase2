/*
¿Qué precio tenían antes del descuento?
En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo.
Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante
el mes de septiembre.
Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento
del 15%. ¿Qué precio tenían antes de aplicar el descuento?
* */
public class Excersise6 {
    public static void main(String[] args) {

        double valorPagado = 34;
        double porcentajeDescuento = (valorPagado * 0.15);
        double precioAntesaplicarDescuento = porcentajeDescuento +valorPagado;

        System.out.printf("El precio que tenían antes de aplicar el descuento es: %.2f €\n",
                precioAntesaplicarDescuento);
    }
}
