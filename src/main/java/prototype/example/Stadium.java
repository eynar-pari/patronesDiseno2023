package prototype.example;

public class Stadium {
    private String name;
    private String capacity;

    public Stadium(String name, String capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getCapacity() {
        return capacity;
    }


    public void showInfo() {
        System.out.println("INFO>Stadium- name: "+name);
        System.out.println("INFO>Stadium- capacity: "+ capacity);
    }
}
