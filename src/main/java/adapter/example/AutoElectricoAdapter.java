package adapter.example;

public class AutoElectricoAdapter implements IAutomovil{
    private AutoElectrico autoElectrico = new AutoElectrico();

    public AutoElectricoAdapter(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void prender() {
        autoElectrico.enceder();

    }

    @Override
    public void marcha(int time) {
        autoElectrico.utilizar(time);
    }

    @Override
    public void cargando(int time) {
        autoElectrico.carga(time);
    }
}
