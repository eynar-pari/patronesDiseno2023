package prototype.practice;

public class Client {
    public static void main(String []argssss){
        Samsumg samsumgR10 = new Samsumg();
        samsumgR10.setMemory("16GB");
        samsumgR10.setSim(new Sim("",""));
        samsumgR10.setAdditionObject("audifonos");
        samsumgR10.setSize("M");
        samsumgR10.setNumberCamera(5);
        samsumgR10.setTimeBatery("6h");
        samsumgR10.setNumberCpu(4);
        samsumgR10.setHasBluetoo(true);
        samsumgR10.setAmountMemory(3);
        samsumgR10.setVersionAndroid("android 18");

        Samsumg s1 = samsumgR10.clone();
        Samsumg s2 = samsumgR10.clone();
        Samsumg s3 = samsumgR10.clone();
        Samsumg s4 = samsumgR10.clone();
        Samsumg s5 = samsumgR10.clone();

        s1.setSim(new Sim("Entel","1231312"));
        s2.setSim(new Sim("Viva","322222"));
        s3.setSim(new Sim("Tigo","333333"));
        s4.setSim(new Sim("Entel","444444"));
        s5.setSim(new Sim("Entel2","555555"));

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();
        s1.showInfo();
    }
}
