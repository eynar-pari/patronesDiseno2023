package builder.practice;

public class I7Medio extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("32");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("Luminosos");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("Luminosos");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("16GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I7");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("8");
    }
}
