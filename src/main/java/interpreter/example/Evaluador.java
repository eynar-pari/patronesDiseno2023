package interpreter.example;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends OperacionMatematicas{
    private List<OperacionMatematicas> formula = new ArrayList<>();
    private Context context;

    //formulaOriginal --> 1 + 23 + 3000 - 44444 - 2 + 2
    public Evaluador(String formulaOriginal){
        context = new Context(formulaOriginal.replace(" ",""));
        for (String msg:formulaOriginal.split(" ")){
            switch (msg){
                case "+":
                    formula.add(new Addition());
                    break;
                case "-":
                    formula.add(new Subtraction());
                    break;
                default:
                    formula.add(new NumberExpression(msg.length()));
                    break;
            }
        }
    }

    public int evaluateFormula(){
        for (OperacionMatematicas operacionMatematicas:formula) {
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {

    }
}
