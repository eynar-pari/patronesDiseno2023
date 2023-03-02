package observer.example;

public class Client {

    public static void main (String []args){

        CanalYoutube upbChannel = new CanalYoutube();
        upbChannel.setName("upb academy");
        upbChannel.setDescription("this academy to share videos");

        Suscriptor jose = new Suscriptor("123","jose jose");
        Suscriptor ambar = new Suscriptor("222","ambar ambar");
        Suscriptor dylan = new Suscriptor("333","dylan dylan");
        Suscriptor emanuel = new Suscriptor("444","emanuel emanuel");

        upbChannel.subscription(jose,"Accion");
        upbChannel.subscription(ambar,"Comedia");
        upbChannel.subscription(dylan,"Terror");
        upbChannel.subscription(emanuel,"Comedia");

        // ****************** //

        upbChannel.uploadVideo(new Video("55555","Terror","Chistes"));

    }

}
