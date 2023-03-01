package chainOfResponsability.practice;

public class Client {

    public static void main (String []args){
        AtencionClient atencionClient = new AtencionClient();
        atencionClient.reportDefect(new Defect("no puedo iniciar sesion","MEDIA","con mi usuario no puedo inciar sesion"));

    }
}
