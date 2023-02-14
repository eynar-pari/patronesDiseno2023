package abstractFactory.example;

import java.util.HashMap;
import java.util.Map;

public class FactoryIdeMap {
    private static Map<String,Ide> ideMap = new HashMap<>();

    public static Ide make(String type){
        ideMap.put("eclipse",new Eclipse());
        ideMap.put("vscode",new VSCode());
        ideMap.put("visualstudio",new VisualStudio());
        ideMap.put("intellij",new IntelliJ());
        ideMap.put("pycharm",new PyCharm());

        return ideMap.containsKey(type)?ideMap.get(type):null;
    }

}
