package chainOfResponsability.example;

public class Persona {
    private String name;
    private String ci;
    private String age;

    public Persona(String name, String ci, String age) {
        this.name = name;
        this.ci = ci;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("ci:"+ci);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
