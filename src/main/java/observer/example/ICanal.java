package observer.example;

public interface ICanal {
    void subscription(IUser user,String category);
    void removeSubscription(IUser user);
    void notify(Video video);
}
