package chainOfResponsability.practice;

public class Defect {
    private String title;
    private String severity;
    private String description;

    public Defect(String title, String severity, String description) {
        this.title = title;
        this.severity = severity;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfo(){
        System.out.println("***** Defect Info *****");
        System.out.println("Defect > title: "+title);
        System.out.println("Defect > severity: "+severity);
        System.out.println("Defect > description: "+description);


    }
}
