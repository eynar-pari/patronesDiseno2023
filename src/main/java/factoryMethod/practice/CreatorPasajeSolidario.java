package factoryMethod.practice;

public class CreatorPasajeSolidario extends CreatorPasaje{

    @Override
    public PasajeSolidario create(Pasajero pasajero) {
        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setPasajero(pasajero);
        Avion avion = new Avion();
        avion.setCapacidad("1 tonelada");
        avion.setMarca("abc");
        avion.setModelo("modelo M");
        avion.setNumAsientos(100);
        pasajeSolidario.setAvion(avion);
        Pais origen = new Pais();
        origen.setAeropuerto("ar1");
        origen.setCiudad("LP");
        origen.setNombre("NA");
        pasajeSolidario.setOrigen(origen);
        Pais destino = new Pais();
        destino.setAeropuerto("ar2");
        destino.setCiudad("CBBA");
        destino.setNombre("NA1");
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setCostoPasaje("100bs");
        pasajeSolidario.setDescuento("10%");
        pasajeSolidario.setNumAsiento("5b");
        pasajeSolidario.setNumeroVuelo("LP608");
        pasajeSolidario.setMotivoDescuento("promo");

        return pasajeSolidario;
    }
}
