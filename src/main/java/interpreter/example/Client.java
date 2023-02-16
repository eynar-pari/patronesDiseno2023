package interpreter.example;

public class Client {
    public static void main (String[]args){
        String msg = "1 + 2 + 3 - 4 - 2 + 2 - 6 + 10 + 333";
        Evaluador evaluador = new Evaluador(msg);
        System.out.println("resultado final: "+evaluador.evaluateFormula());



    }
}
