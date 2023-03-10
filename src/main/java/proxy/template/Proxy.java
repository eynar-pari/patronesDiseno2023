package proxy.template;

public class Proxy implements ISubject{

    private String attribute1;
    private String attribute2;
    private RealSubject realSubject = new RealSubject();

    public Proxy() {
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void request() {
        // condiciones
        // restricciones
        // nueva implementacion que puede agregarse
        System.out.println("PROXY> verificando si cumple la condicion");
        if (this.attribute1.equals("Admin")){
            realSubject.setAttribute1(this.attribute1);
            realSubject.request();
        }else{
            System.out.println("No se pudo acceder al obejto real, no cumple los requisitos");
        }

    }
}
