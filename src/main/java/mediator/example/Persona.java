package mediator.example;

public abstract class Persona {
    protected ICanalComunication canalComunication;
    private String ci;
    private String name;
    private String cargo; // QA / DEV / SM

    public Persona(ICanalComunication canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("ci: "+ci);
        System.out.println("name: "+name);
        System.out.println("cargo: "+cargo);
        System.out.println("-------------------------");

    }
    public abstract void send(String msg);
    public abstract void received(String msg);

}
