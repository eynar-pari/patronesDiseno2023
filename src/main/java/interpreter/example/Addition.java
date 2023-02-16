package interpreter.example;

public class Addition extends OperacionMatematicas {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo=1;
            context.input=context.input.substring(1);
        }
    }
}
