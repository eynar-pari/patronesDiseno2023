package command.template;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand>  commandList = new ArrayList<>();

    public Invoker addCommand(ICommand command){
        commandList.add(command);
        return this;
    }

    public void run(){
        for (ICommand cmd:commandList) {
            cmd.execute();
        }
        commandList.clear();
    }


}
