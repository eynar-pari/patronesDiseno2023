package state.example;

public class Computadora {
    private MemoryRam memoryRam;
    private TargetaVideo targetaVideo;
    // IState
    private IStateComputer stateComputer;


    public Computadora(MemoryRam memoryRam, TargetaVideo targetaVideo) {
        this.memoryRam = memoryRam;
        this.targetaVideo = targetaVideo;
    }

    public MemoryRam getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(MemoryRam memoryRam) {
        this.memoryRam = memoryRam;
    }

    public TargetaVideo getTargetaVideo() {
        return targetaVideo;
    }

    public void setTargetaVideo(TargetaVideo targetaVideo) {
        this.targetaVideo = targetaVideo;
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void useComputer(){
        this.stateComputer.computerBehavior(this);
    }
}
