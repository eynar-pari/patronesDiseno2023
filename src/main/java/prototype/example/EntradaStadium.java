package prototype.example;

public class EntradaStadium implements IEntrada{

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int numeroAsiento;
    private String fecha;
    private String lugar;
    private Stadium stadium;
    private String precioEntrada;
    private Persona persona;

    public EntradaStadium(Equipo equipoLocal, Equipo equipoVisitante, Stadium stadium) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.stadium = stadium;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(String precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public EntradaStadium clone() {
        EntradaStadium clone = new EntradaStadium(this.equipoLocal,
                                            this.equipoVisitante
                                            ,this.stadium);
        clone.setFecha(this.getFecha());
        clone.setLugar(this.getLugar());
        clone.setNumeroAsiento(this.getNumeroAsiento());
        clone.setPersona(this.getPersona());
        clone.setPrecioEntrada(this.getPrecioEntrada());

        return clone;
    }

    public void showInfo() {
        System.out.println("\n ----------------  \n");
        System.out.println("fecha "+getFecha());
        System.out.println("lugar "+getLugar());
        System.out.println("precio "+getPrecioEntrada());
        equipoLocal.showInfo();
        equipoVisitante.showInfo();
        stadium.showInfo();
        System.out.println("# asiento "+getNumeroAsiento());
        persona.showInfo();
    }
}
