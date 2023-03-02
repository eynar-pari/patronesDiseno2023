package observer.example;

public class Video {
    private String id;
    private String category;
    private String titulo;

    public Video(String id, String category, String titulo) {
        this.id = id;
        this.category = category;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void showInfo() {
        System.out .println("Video{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", titulo='" + titulo + '\'' +
                '}');
    }
}
