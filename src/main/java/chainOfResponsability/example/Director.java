package chainOfResponsability.example;


public class Director implements IHandler {
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
          if (amount >= 7000 && amount < 14000){
             System.out.println("INFO> El Director aprobo el prestamo de: ["+amount+ "] a :");
             persona.showInfo();
          } else {
              System.out.println("WARN >El Director no puede manejar este monto > ["+amount+"] le pasa el ticket al nivel superior ....");
              next.prestamo(persona,amount);
          }
    }
}
