package chainOfResponsability.example;


public class Presidente implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void prestamo(Persona persona,int amount) {
            // cadena
          if (amount >= 40000 ){
             System.out.println("INFO> El Presidente aprobo el prestamo de: ["+amount+ "] a :");
             persona.showInfo();
          } else {
              System.out.println("WARN >El Gerente no puede manejar este monto > ["+amount+"] ....");

          }
    }
}
