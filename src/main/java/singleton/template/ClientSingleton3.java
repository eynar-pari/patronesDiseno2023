package singleton.template;

public class ClientSingleton3 {

    public static void main(String[]args){

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 singleton1 = Singleton3.getInstance();
                System.out.println("singleton 1 : "+singleton1);
                System.out.println("singleton 1 : "+singleton1.hashCode());
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 singleton2 = Singleton3.getInstance();
                System.out.println("singleton 2 : "+singleton2);
                System.out.println("singleton 2 : "+singleton2.hashCode());
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 singleton3 = Singleton3.getInstance();
                System.out.println("singleton 3 : "+singleton3);
                System.out.println("singleton 3 : "+singleton3.hashCode());
            }
        });

        user1.start();
        user2.start();
        user3.start();
    }
}
