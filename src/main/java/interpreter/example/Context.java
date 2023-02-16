package interpreter.example;

public class Context {
    protected String input = ""; // 2 + 6 - 4 + 5 - 6
    protected int output = 0;
    protected int signo = 1;

    public Context(String input){
        this.input=input;
    }
}
