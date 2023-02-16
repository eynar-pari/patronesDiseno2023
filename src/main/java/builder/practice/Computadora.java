package builder.practice;

public class Computadora {
    //monitor, teclado, mouse, memoria, procesador, video
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private String video;

    public Computadora() {
    }

    public String getMonitor() {
        return monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getVideo() {
        return video;
    }

    public Computadora setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public Computadora setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }

    public Computadora setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public Computadora setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public Computadora setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public Computadora setVideo(String video) {
        this.video = video;
        return this;
    }

    public void showInfo(){
        System.out.println("*** Computadora ***");
        System.out.println("monitor:"+monitor);
        System.out.println("teclado:"+teclado);
        System.out.println("mouse:"+mouse);
        System.out.println("memoria:"+memoria);
        System.out.println("procesador:"+procesador);
        System.out.println("video:"+video);
    }



}
