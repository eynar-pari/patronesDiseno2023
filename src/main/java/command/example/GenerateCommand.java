package command.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateCommand {

    private List<ICommand> commandList = new ArrayList<>();

    public void addNewCommand(ICommand cmd){
        commandList.add(cmd);
    }

    public void run(){
        for (ICommand command:commandList) {
            command.execute();
        }
    }

}
