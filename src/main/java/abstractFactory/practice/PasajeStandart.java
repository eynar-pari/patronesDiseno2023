package abstractFactory.practice;

public class PasajeStandart implements IPasaje {

    private String numeroVuelo;
    private Pais destino;
    private Pais origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numAsiento;
    private String costoPasaje;


    @Override
    public void showInfo() {
        System.out.println("****** Pasaje Standart");
        System.out.println("numeroVuelo:"+numeroVuelo);
        System.out.println("numAsiento:"+numAsiento);
        System.out.println("costoPasaje:"+costoPasaje);
        System.out.println("-Destino-");
        destino.printInfo();
        System.out.println("-Origen-");
        origen.printInfo();
        avion.printInfo();
        pasajero.printInfo();
    }

    @Override
    public void create() {
        System.out.println("creando pasaje solidario");
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Pais getDestino() {
        return destino;
    }

    public void setDestino(Pais destino) {
        this.destino = destino;
    }

    public Pais getOrigen() {
        return origen;
    }

    public void setOrigen(Pais origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }


}
