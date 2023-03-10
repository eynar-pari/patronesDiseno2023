package proxy.example;

import java.util.Date;

public class Archivo {
    private String name;
    private String extention;
    private String size;
    private String dateCreate;

    public Archivo(String name, String extention, String size) {
        this.name = name;
        this.extention = extention;
        this.size = size;
        this.dateCreate = String.valueOf(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void show(){
        System.out.println(">>>>>>> File <<<<<<<<");
        System.out.println("name: "+name);
        System.out.println("extention: "+extention);
        System.out.println("size: "+size);
        System.out.println("dateCreate: "+dateCreate);

    }


}
