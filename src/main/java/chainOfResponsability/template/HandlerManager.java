package chainOfResponsability.template;

public class HandlerManager implements IHandler{
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
         HandlerConcreteA handlerConcreteA = new HandlerConcreteA();
         this.setNext(handlerConcreteA);

         HandlerConcreteB handlerConcreteB = new HandlerConcreteB();
         handlerConcreteA.setNext(handlerConcreteB);

         HandlerConcreteC handlerConcreteC = new HandlerConcreteC();
         handlerConcreteB.setNext(handlerConcreteC);

         HandlerConcreteD handlerConcreteD = new HandlerConcreteD();
         handlerConcreteC.setNext(handlerConcreteD);

         this.next.criteriaHandler(amount);

    }
}
