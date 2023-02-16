package builder.practice;

public class I5Bajo extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("24");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("normal");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("8GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I5");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("4");
    }
}
