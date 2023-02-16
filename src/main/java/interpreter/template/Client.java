package interpreter.template;

public class Client {

    public static void main (String[]args){
        String msg = "A B A B C C D D";
        //             12123344

        NonTerminalExpression parser = new NonTerminalExpression(msg);
        String msgInter= parser.outputMessage();
        System.out.println("msgInter:"+msgInter);
    }
}
