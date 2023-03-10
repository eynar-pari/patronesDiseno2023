package proxy.example;

import java.util.ArrayList;
import java.util.List;

public class FileServer implements IServer {
    private String ipHostName;
    private String port;
    private String limitStorage;
    private List<Archivo> store = new ArrayList<>();

    public FileServer(String ipHostName, String port, String limitStorage) {
        this.ipHostName = ipHostName;
        this.port = port;
        this.limitStorage = limitStorage;
    }

    public String getIpHostName() {
        return ipHostName;
    }

    public void setIpHostName(String ipHostName) {
        this.ipHostName = ipHostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getLimitStorage() {
        return limitStorage;
    }

    public void setLimitStorage(String limitStorage) {
        this.limitStorage = limitStorage;
    }


    @Override
    public void uploadFile(Archivo file) {
        store.add(file);
        System.out.println("Archivo Guardado");
    }

    public void removeFile(Archivo file){
        store.remove(file);
    }

    public Archivo getFile(Archivo file){
        for (Archivo f: store
             ) {
            if (f.getName().equals(file.getName()) && f.getExtention().equals(file.getExtention())){
                return f;
            }
        }
        System.out.println("ERROR> el archivo no se encuentra en el servidor");
        return null;
    }

    public List<Archivo> getStore() {
        return store;
    }
}
