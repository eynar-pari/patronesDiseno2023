package memento.practice;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private String name;
    private String license;
    private Map<String,Persona> personaMap = new HashMap<>();

    public DataBase(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Persona getPersona(String ci) {
        return personaMap.get(ci);
    }

    public void addPersona(Persona persona) {
        this.personaMap.put(persona.getCi(),persona);
    }

    public Map<String, Persona> getPersonaMap() {
        return personaMap;
    }

    public void setPersonaMap(Map<String, Persona> personaMap) {
        this.personaMap = personaMap;
    }

    public DataBase clone(){
        DataBase tmp = new DataBase();
        tmp.setName(this.getName());
        tmp.setLicense(this.getLicense());
        Map <String,Persona> tmpMap = new HashMap<>();

        for (String ci:this.personaMap.keySet()) {
            tmpMap.put(ci,this.personaMap.get(ci));
        }

        tmp.setPersonaMap(tmpMap);
        return tmp;
    }

    public void showDataBase(){
        System.out.println("DataBase > name: "+name);
        System.out.println("DataBase > license"+this.license);
        System.out.println("------- info-------");
        for (String ci:this.personaMap.keySet()) {
            this.personaMap.get(ci).showInfo();
        }
        System.out.println("--------------------");
    }
}
