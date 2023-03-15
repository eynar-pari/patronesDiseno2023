package bridge.example.nobridge;

public class Client {

    public static void main(String []args){

        Circulo circulo = new Circulo();
        circulo.pintarAmarilla();
        circulo.pintarRojo();

        Triangulo triangulo = new Triangulo();
        triangulo.pintarVerde();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.pintarAmarilla();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.pintarRojo();

        rectangulo.pintarCafe();

        rectangulo.pintarNegro();

    }



}
