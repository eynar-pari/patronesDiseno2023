package singleton.template;

public class ClientSingleton1 {

    public static void main(String[]args){

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        Singleton1.getInstance().destroySingleton();
        Singleton1 singleton3 = Singleton1.getInstance();

        System.out.println("singleton 1 : "+singleton1);
        System.out.println("singleton 2 : "+singleton2);
        System.out.println("singleton 3 : "+singleton3);

        System.out.println("singleton 1 : "+singleton1.hashCode());
        System.out.println("singleton 2 : "+singleton2.hashCode());
        System.out.println("singleton 3 : "+singleton3.hashCode());

        singleton1.getName();
        singleton2.getName();
        singleton3.getName();
    }
}
