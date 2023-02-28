package memento.practice;



public class Memento {

    private DataBase dataBase;

    public Memento(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
