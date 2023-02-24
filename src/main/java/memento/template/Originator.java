package memento.template;

public class Originator {
    private ConcreteObject concreteObject;

    public void setMemento(ConcreteObject state){
        System.out.println("Originator> setMemento"+state.getState());
        state.showInfo();
        concreteObject =state;
    }


    public Memento createMemento(){
        return new Memento(concreteObject);
    }

    public void restoreMemento(Memento memento){
        concreteObject = memento.getConcreteObject();
        System.out.println("Restore Object");
        concreteObject.showInfo();
    }

}
