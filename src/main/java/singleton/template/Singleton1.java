package singleton.template;

public class Singleton1 {
    //1) attribute same type
    private static Singleton1 instance = null;

    //2) constructor private
    private Singleton1(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    public void getName(){
        System.out.println("singleton ..");
    }

    public void destroySingleton(){
        instance = null;
    }
}
