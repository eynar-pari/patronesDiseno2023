package iterator.practice;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Automovil a1 = new Automovil();
        a1.setCosto("2k").setId("01").setModelo("M1").setNumAsientos("10").setTipo("4x4");
        Automovil a2 = new Automovil();
        a2.setCosto("3k").setId("02").setModelo("M2").setNumAsientos("4").setTipo("4x4");
        Automovil a3 = new Automovil();
        a3.setCosto("4k").setId("05").setModelo("M3").setNumAsientos("6").setTipo("4x4");
        Automovil a4 = new Automovil();
        a4.setCosto("5k").setId("06").setModelo("M4").setNumAsientos("8").setTipo("4x4");
        Automovil a5 = new Automovil();
        a5.setCosto("6k").setId("08").setModelo("M55").setNumAsientos("20").setTipo("4x4");
        Automovil a6 = new Automovil();
        a6.setCosto("7k").setId("10").setModelo("M5").setNumAsientos("4").setTipo("4x4");

        Suzuki suzuki = new Suzuki();
        suzuki.addAutomovil(a1);
        suzuki.addAutomovil(a2);

        Toyota toyota = new Toyota();
        toyota.addAutomovil(a3);
        toyota.addAutomovil(a4);

        Quantum quantum = new Quantum();
        quantum.addAutomovil(a5);
        quantum.addAutomovil(a6);

        Map<String,Automovil> aduana = new HashMap<>();
        Iterator iterator = suzuki.createIterator();
        while (iterator.hasNext()){
            Automovil tmp = iterator.next();
            tmp.showInfo();
            aduana.put(tmp.getId(),tmp);
        }
        iterator = toyota.createIterator();
        while (iterator.hasNext()){
            Automovil tmp = iterator.next();
            tmp.showInfo();
            aduana.put(tmp.getId(),tmp);
        }
        iterator = quantum.createIterator();
        while (iterator.hasNext()){
            Automovil tmp = iterator.next();
            tmp.showInfo();
            aduana.put(tmp.getId(),tmp);
        }

        System.out.println("*******************");
        for (String key:aduana.keySet()) {
            System.out.println("-------- automovil -------");
            aduana.get(key).showInfo();
        }


    }
}
