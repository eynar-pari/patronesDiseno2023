package adapter.example;

public class Client {

    public static void main(String []args){

        IAutomovil automovilDiesel = new AutoDiesel();
        automovilDiesel.prender();
        automovilDiesel.cargando(15);
        automovilDiesel.marcha(10);

        IAutomovil automovilGasolina = new AutoGasolina();
        automovilGasolina.prender();
        automovilGasolina.cargando(25);
        automovilGasolina.marcha(10);

        AutoElectrico autoElectrico = new AutoElectrico();

        IAutomovil autoE = new AutoElectricoAdapter(autoElectrico);
        autoE.prender();
        autoE.cargando(25);
        autoE.marcha(10);

    }
}
