package decorator.example;

public class IntelliJ implements IDE {

    private String name;
    private String license;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public void operation() {
        System.out.println("IntelliJ> compilando & build");
    }
}
