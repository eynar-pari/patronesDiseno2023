package prototype.practice;

public class Samsumg implements  IPhone{
    private String size;
    private int numberCpu;
    private String memory;
    private Sim sim = new Sim();
    private String versionAndroid;
    private int numberCamera;
    private boolean hasBluetoo;
    private int amountMemory;
    private String timeBatery;
    private String additionObject;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberCpu() {
        return numberCpu;
    }

    public void setNumberCpu(int numberCpu) {
        this.numberCpu = numberCpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public int getNumberCamera() {
        return numberCamera;
    }

    public void setNumberCamera(int numberCamera) {
        this.numberCamera = numberCamera;
    }

    public boolean isHasBluetoo() {
        return hasBluetoo;
    }

    public void setHasBluetoo(boolean hasBluetoo) {
        this.hasBluetoo = hasBluetoo;
    }

    public int getAmountMemory() {
        return amountMemory;
    }

    public void setAmountMemory(int amountMemory) {
        this.amountMemory = amountMemory;
    }

    public String getTimeBatery() {
        return timeBatery;
    }

    public void setTimeBatery(String timeBatery) {
        this.timeBatery = timeBatery;
    }

    public String getAdditionObject() {
        return additionObject;
    }

    public void setAdditionObject(String additionObject) {
        this.additionObject = additionObject;
    }

    @Override
    public Samsumg clone() {
        Samsumg clone = new Samsumg();
        clone.setAdditionObject(this.getAdditionObject());
        clone.setAmountMemory(this.getAmountMemory());
        clone.setHasBluetoo(this.isHasBluetoo());
        clone.setMemory(this.getMemory());
        clone.setNumberCamera(this.getNumberCamera());
        clone.setSim(this.getSim());
        clone.setNumberCpu(this.getNumberCpu());
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setSize(this.getSize());
        clone.setTimeBatery(this.getTimeBatery());
        return clone;
    }

    public void showInfo() {
        System.out.println("********************************+");
        System.out.println("accesorios: "+this.getAdditionObject());
        System.out.println("cantidad de memorias slots: "+this.getAmountMemory());
        System.out.println("tiene bluetoo? "+this.isHasBluetoo());
        System.out.println("capacidad meoria: "+this.getMemory());
        System.out.println("numero de camaras:"+this.getNumberCamera());
        System.out.println("numero de cores:"+this.getNumberCpu());
        System.out.println("version de android: "+this.getVersionAndroid());
        System.out.println("tamano: "+this.getSize());
        System.out.println("duracion de la bateria: "+this.getTimeBatery());
        sim.showInfo();
    }
}
