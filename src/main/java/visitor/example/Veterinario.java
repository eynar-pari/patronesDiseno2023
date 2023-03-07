package visitor.example;

public class Veterinario implements IMedico{
    @Override
    public void tratamiento(Gato gato) {
        System.out.println(">>>>>>>>>> Gato <<<<<<<<<<<<<<<<<");
        if (gato.isEstaEnfermo()){
            System.out.println("receta medicina para el Gato");
            gato.setEstaEnfermo(false);
            gato.comer();
        }else{
            System.out.println("El Gato esta sano no necesita tratamiendo");
        }
    }

    @Override
    public void tratamiento(Caballo caballo) {
        System.out.println(">>>>>>>>>> caballo <<<<<<<<<<<<<<<<<");
        if (caballo.isEstaEnfermo()){
            System.out.println("receta medicina para el Caballo");
            caballo.setEstaEnfermo(false);
            caballo.run();
        }else{
            System.out.println("El Caballo esta sano no necesita tratamiendo");
        }
    }

    @Override
    public void tratamiento(Perro perro) {
        System.out.println(">>>>>>>>>> perro <<<<<<<<<<<<<<<<<");
        if (perro.isEstaEnfermo()){
            System.out.println("receta medicina para el Caballo");
            perro.setEstaEnfermo(false);
            perro.run();
            perro.comer();
        }else{
            System.out.println("El Perro esta sano no necesita tratamiendo");
        }
    }
}
