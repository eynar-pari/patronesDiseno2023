package chainOfResponsability.template;

public class HandlerConcreteC implements IHandler{
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
          if (amount >= 200 && amount < 300){
              System.out.println("Este valor es atentido por: HandlerConcreteC <<***>>");
          } else {
              next.criteriaHandler(amount);
          }
    }
}
