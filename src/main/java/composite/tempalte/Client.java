package composite.tempalte;

public class Client {

    public static void main(String []args){
        Leaf urbanizacion = new Leaf("urb 1","20");
        Leaf urbanizacion2 = new Leaf("urb 2","20");
        Leaf urbanizacion3 = new Leaf("urb 3","20");


        Composite ciudad = new Composite(">>>ciudad1","50000bs");
        ciudad.add(urbanizacion);
        ciudad.add(urbanizacion2);
        ciudad.add(urbanizacion3);

        Composite ciudad2 = new Composite(">>> ciudad2","50000bs");
        ciudad.add(new Leaf("urb 4","20"));
        ciudad.add(new Leaf("urb 5","20"));
        ciudad.add(new Leaf("urb 6","20"));

        Composite departamento = new Composite(">> dpt1","1");
        departamento.add(ciudad);
        departamento.add(ciudad2);

        Composite departamento1 = new Composite(">> dpt1","1");
        departamento1.add(ciudad);
        departamento1.add(ciudad2);

        Composite pais = new Composite("> bolivia","9000000");
        pais.add(departamento);
        pais.add(departamento1);

        pais.operation();


    }

}
