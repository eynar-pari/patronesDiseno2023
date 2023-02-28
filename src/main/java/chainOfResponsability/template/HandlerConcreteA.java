package chainOfResponsability.template;

public class HandlerConcreteA implements IHandler{
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
          if (amount < 100){
              System.out.println("Este valor es atentido por: HandlerConcreteA <<***>>");
          } else {
              next.criteriaHandler(amount);
          }
    }
}
