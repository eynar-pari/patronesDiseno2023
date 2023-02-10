package singleton.practice;

import java.io.IOException;

public class Client {
    public static void main(String[]args) throws IOException {
        Promosion promosion = new Promosion("verano");
        promosion.setTipo("invierno");
        promosion.getTipo();

        Cliente cliente = new Cliente("123123");
        cliente.setCi("55555");
        cliente.getCi();

        Factura factura = new Factura("01");
        factura.setCodigo("02");
        factura.getCodigo();

        Producto producto = new Producto("caja");
        producto.setName("caja pc");
        producto.getName();


        Logger.getInstance().closeWriter();
    }
}
