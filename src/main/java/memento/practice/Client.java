package memento.practice;

public class Client {

    public static void main (String []args){
        GestorBD gestorBD = new GestorBD();
        Originator originator = new Originator();

        DataBase db = new DataBase();
        db.setName("upb db");
        db.setLicense("open source");

        db.addPersona(new Persona("111","jose","20"));
        db.addPersona(new Persona("222","juan","30"));
        originator.setBackup(db);
        gestorBD.addBackup("BackupEnero",originator.createBackup());

        db.addPersona(new Persona("333","ambar","20"));
        db.addPersona(new Persona("444","ander","30"));
        originator.setBackup(db);
        gestorBD.addBackup("BackupFebrero",originator.createBackup());

        db.addPersona(new Persona("555","dylan","20"));
        db.addPersona(new Persona("666","emanuel","30"));
        originator.setBackup(db);
        gestorBD.addBackup("BackupMarzo",originator.createBackup());

        db.addPersona(new Persona("777","enrique","20"));
        db.addPersona(new Persona("888","jhosias","30"));
        originator.setBackup(db);
        gestorBD.addBackup("BackupAbril",originator.createBackup());

        db.addPersona(new Persona("999","juancla","20"));
        db.addPersona(new Persona("123","katzumi","30"));
        originator.setBackup(db);
        gestorBD.addBackup("BackupMayo",originator.createBackup());

        System.out.println(" **** deberia de mostrar TODO *****");
        db.showDataBase();
        System.out.println(" **** deberia de mostrar solo 4 personas *****");
        db = originator.restoreBackup(gestorBD.getBackup("BackupFebrero"));
        db.showDataBase();

        System.out.println(" **** deberia de mostrar solo 10 personas *****");
        db = originator.restoreBackup(gestorBD.getBackup("BackupMayo"));
        db.showDataBase();
    }

}
