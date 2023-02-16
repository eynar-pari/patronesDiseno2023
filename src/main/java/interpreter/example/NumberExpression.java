package interpreter.example;

public class NumberExpression extends OperacionMatematicas {

    public NumberExpression(int digit){
        this.digit=digit;
    }
  //  5  +   4  -  2

    @Override
    public void interpreter(Context context) {
            context.output=context.output+ (context.signo* Integer.parseInt(context.input.substring(0,this.digit)));
            context.input=context.input.substring(this.digit);
    }
}
