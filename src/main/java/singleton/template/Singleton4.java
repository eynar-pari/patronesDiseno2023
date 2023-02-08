package singleton.template;

public class Singleton4 implements Cloneable{
    //1) attribute same type
    private static Singleton4 instance = null;

    //2) constructor private
    private Singleton4(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton4 getInstance(){
        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }

    public void getName(){
        System.out.println("singleton ..");
    }

    public void destroySingleton(){
        instance = null;
    }

    public Object clone(){
        throw  new RuntimeException("ERROR! the method is not supported");
    }
}
