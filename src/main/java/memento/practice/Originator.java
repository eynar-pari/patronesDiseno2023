package memento.practice;

public class Originator {
    private DataBase dataBase;

    public void setBackup(DataBase dataBase){
        this.dataBase = dataBase.clone();
    }


    public Memento createBackup(){
        return new Memento(dataBase);
    }

    public DataBase restoreBackup(Memento memento){
        dataBase = memento.getDataBase();
        System.out.println("Restoring database .......");
        return dataBase;
    }

}
