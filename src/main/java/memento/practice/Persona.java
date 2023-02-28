package memento.practice;

public class Persona {

    private String ci;
    private String name;
    private String age;

    public Persona(String ci, String name, String age) {
        this.ci = ci;
        this.name = name;
        this.age = age;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Persona clone(){
        Persona tmp = new Persona(this.getCi(),this.getName(),this.getAge());
        return tmp;
    }

    public void showInfo(){
        System.out.println("---------> Persona <----------");
        System.out.println("Persona > ci: "+ci);
        System.out.println("Persona > name: "+name);
        System.out.println("Persona > age: "+age);
    }
}

