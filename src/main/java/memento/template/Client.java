package memento.template;

public class Client {
    public static void main (String []args){
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        ConcreteObject concreteObject;

        concreteObject = new ConcreteObject("a1","b1","trimestre > 1 <");
        originator.setMemento(concreteObject);
        careTaker.addMemento(originator.createMemento());  // [0] una posicion en nuestra lista - creando un punto de restauracion

        concreteObject = new ConcreteObject("a2","b2","trimestre > 2 <");

        concreteObject = new ConcreteObject("a3","b3","trimestre > 3 <");
        originator.setMemento(concreteObject);
        careTaker.addMemento(originator.createMemento());  // [1] una posicion en nuestra lista - creando un punto de restauracion

        concreteObject = new ConcreteObject("a4","b4","trimestre > 4 <");

        concreteObject = new ConcreteObject("a5","b5","trimestre > 5 <");
        originator.setMemento(concreteObject);
        careTaker.addMemento(originator.createMemento());  // [3] una posicion en nuestra lista - creando un punto de restauracion

        System.out.println("Deberia mostrarme es estado 5");
        concreteObject.showInfo();


        System.out.println("Deberia mostrarme es estado 3");
        // restaurando
        originator.restoreMemento(careTaker.getMemento(1));




    }

}
