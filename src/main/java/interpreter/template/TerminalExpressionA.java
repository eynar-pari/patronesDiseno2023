package interpreter.template;

public class TerminalExpressionA extends AbstractExpression {
    @Override  // ABCD  --->
               // input  ABCD //    BCD   --> CD  ---> D  ----->
               // output      //  1           12  ---> 123    ----> 1234
    public void interpreter(Context context) {
        if (context.input.startsWith("A")){
            context.output=context.output+"1";
            context.input = context.input.substring(1);
        }
    }
}
