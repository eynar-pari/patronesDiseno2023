package proxy.template;

public class Client {
    public static void main(String[]args){
        Proxy proxy = new Proxy();
        proxy.setAttribute1("Admin");
        proxy.request();

    }
}
