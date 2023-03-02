package observer.example;

public class Suscriptor implements IUser{
    private String ci;
    private String name;
    private String category;
    public Suscriptor(String ci, String name) {
        this.ci = ci;
        this.name = name;
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

    @Override
    public void update(String message, Video video) {
        System.out.println(">>>>>>>>>>> notification <<<<<<<<<<<<<");
        System.out.println("name: "+name);
        System.out.println("ci: "+ci);
        System.out.println("category: "+category);
        System.out.println(message);
        video.showInfo();
        System.out.println(">>>>>>>>>>>              <<<<<<<<<<<<<");
    }

    @Override
    public void setCategoryVideo(String categoria) {
        this.category=categoria;
    }

    @Override
    public String getCategoryVideo() {
        return category;
    }
}
