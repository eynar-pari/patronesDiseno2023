package mediator.example;

public class Client {
    public static void main (String args[]){

        Slack upbSlack = new Slack();

        Profesional dev1 =  new Profesional(upbSlack);
        dev1.setCi("111").setName("Jose").setCargo("DEV");
        Profesional dev2 =  new Profesional(upbSlack);
        dev2.setCi("222").setName("Ambar").setCargo("DEV");
        Profesional dev3 =  new Profesional(upbSlack);
        dev3.setCi("333").setName("Ander").setCargo("DEV");
        Profesional dev4 =  new Profesional(upbSlack);
        dev4.setCi("777777").setName("Juan").setCargo("DEV");

        Profesional qa1 = new Profesional(upbSlack);
        qa1.setCi("444").setName("Hugo").setCargo("QA");
        Profesional qa2 = new Profesional(upbSlack);
        qa2.setCi("666").setName("Brenda").setCargo("QA");
        Profesional qa3 = new Profesional(upbSlack);
        qa3.setCi("888").setName("Emanuel").setCargo("QA");

        Profesional sm1 = new Profesional(upbSlack);
        sm1.setCi("00022").setName("Eynar").setCargo("SM");
        Profesional sm2 = new Profesional(upbSlack);
        sm2.setCi("00055").setName("Alexia").setCargo("SM");

        upbSlack.addProfesionalToTheChat(dev1)
                .addProfesionalToTheChat(dev2)
                .addProfesionalToTheChat(dev3)
                .addProfesionalToTheChat(qa1)
                .addProfesionalToTheChat(qa2)
                .addProfesionalToTheChat(qa3)
                .addProfesionalToTheChat(sm1)
                .addProfesionalToTheChat(dev4)
                .addProfesionalToTheChat(sm2);


        qa1.send("Hola a todos los QAS");
        dev3.send("Hola a todos los DEV");
        sm1.send(" >> Hola a Todos <<");


    }

}
