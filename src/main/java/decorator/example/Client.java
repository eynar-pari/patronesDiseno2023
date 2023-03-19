package decorator.example;

public class Client {

    public static void main (String[]args){
        IDE eclipse = new Eclipse();


        eclipse = new UnitTest(eclipse,"unit test","free");
        eclipse = new Debug(eclipse," debug","free");
        eclipse = new DeployDocker(eclipse,"docker","free");

        eclipse.operation();

        System.out.println(" ******************  ");



    }

}
