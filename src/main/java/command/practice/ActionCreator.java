package command.practice;

import java.util.ArrayList;
import java.util.List;

public class ActionCreator {

    private List<IAction> actionList = new ArrayList<>();

    public ActionCreator addAction(IAction action){
        actionList.add(action);
        return this;
    }

    public void runCmd(){
        for (IAction action:actionList) {
            action.execute();
        }
    }

    public void clearActions(){
        actionList.clear();
    }

}
