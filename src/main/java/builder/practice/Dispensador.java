package builder.practice;


public class Dispensador {
    private BuilderComputadora computadora;

    public Computadora getComputadora(){
        return computadora.getComputadora();
    }

    public void setModel(BuilderComputadora computadora){
        this.computadora = computadora;
    }

    public void buildComputadora(){
        this.computadora.createComputadora();
        this.computadora.buildMemoria();
        this.computadora.buildMonitor();
        this.computadora.buildMouse();
        this.computadora.buildProcesador();
        this.computadora.buildVideo();
        this.computadora.buildTeclado();
    }


}
