package observer.template;

public class ConcreteObserverA  implements  IObserver{
    @Override
    public void update(String msg) {
        System.out.println(">>> ConcreteObserverA <<<");
        System.out.println(">>> Notify <<<");
        System.out.println(msg);
    }
}
