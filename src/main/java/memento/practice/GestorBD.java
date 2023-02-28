package memento.practice;

import java.util.HashMap;
import java.util.Map;

public class GestorBD {
    private Map<String,Memento> backupsMap = new HashMap();

    public GestorBD addBackup(String alias, Memento memento){
        backupsMap.put(alias,memento);
        return this;
    }

    public Memento getBackup(String alias){
        return backupsMap.get(alias);
    }


}
