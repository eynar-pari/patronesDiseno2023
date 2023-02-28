package chainOfResponsability.template;

public class HandlerConcreteB implements IHandler{
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
          if (amount >= 100 && amount < 200){
              System.out.println("Este valor es atentido por: HandlerConcreteB <<***>>");
          } else {
              next.criteriaHandler(amount);
          }
    }
}
