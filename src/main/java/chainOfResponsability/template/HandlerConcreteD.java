package chainOfResponsability.template;

public class HandlerConcreteD implements IHandler{
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
    public void criteriaHandler(int amount) {
            // cadena
          if ( amount >= 300){
              System.out.println("Este valor es atentido por: HandlerConcreteD ------ ");
          }
    }
}
