package command.example;

public class Ide {
    private String name;
    private String version;
    private String license;
    private String owner;

    public Ide(String name, String version, String license, String owner) {
        this.name = name;
        this.version = version;
        this.license = license;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void cleanBuild(){
        // remover la carpeta
        System.out.println("INFO > removiendo carpeta BUILD ...");
    }

    public void runUnitTest(){
        // remover la carpeta
        System.out.println("INFO > running unit test ...");
        System.out.println("INFO > 50 test PASSED");
    }

    public void compileCode(){
        // remover la carpeta
        System.out.println("INFO > compiling ...");
        System.out.println("INFO > reviewing standarizatio ..");
    }

    public void createJarFile(){
        System.out.println("INFO >creating JAR file ...");
    }

    public void showInfo(){
        System.out.println("name: "+name);
        System.out.println("version: "+version);
        System.out.println("license: " +license);
        System.out.println("owner: "+owner);
    }
}
