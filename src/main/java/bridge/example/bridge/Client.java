package bridge.example.bridge;

public class Client {

    public static void main (String[]args){
        Circulo circulo = new Circulo(new Amarilllo());
        circulo.pintar();
        circulo.setColor(new Verde());
        circulo.pintar();

        Cuadrado cuadrado = new Cuadrado( new Rojo());
        cuadrado.pintar();

        Circulo circulo1 = new Circulo(new Amarilllo());
        circulo1.pintar();

        Rectangulo rectangulo = new Rectangulo(new Rojo());
        rectangulo.pintar();
        rectangulo.setColor(new Cafe());
        rectangulo.pintar();

        rectangulo.setColor(new Negro());
        rectangulo.pintar();


    }
}
