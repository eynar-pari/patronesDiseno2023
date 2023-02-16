package builder.practice;

public class I9Alto extends BuilderComputadora {
    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("45");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("Luminosos");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("gamer");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("32GB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I9");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("16");
    }
}
