package interpreter.template;

public class TerminalExpressionD extends AbstractExpression {
    // input             D  ----->
    // output            123    ----> 1234
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("D")){
            context.output=context.output+"4";
            context.input = context.input.substring(1);
        }
    }
}
