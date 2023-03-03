package state.example;

public class Client {
    public static void main (String []args){
        MemoryRam ram = new MemoryRam(0,"16G","DDR4");
        TargetaVideo targetaVideo = new TargetaVideo(0,"32G","MSI");
        Computadora pc = new Computadora(ram,targetaVideo);

        pc.setStateComputer(new Apagado());
        pc.useComputer();

        pc.setStateComputer(new ProgramaChrome());
        pc.useComputer();

        pc.setStateComputer(new Apagado());
        pc.useComputer();
    }

}
