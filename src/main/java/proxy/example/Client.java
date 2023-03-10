package proxy.example;

public class Client {
    public static void main (String []args){
        ServerProxy fileServer = new ServerProxy("10.20.10.10","8080","500TB");
        fileServer.uploadFile(new Archivo("file1","PDF","4mb"));
        fileServer.uploadFile(new Archivo("file2","DOC","78mb"));
        fileServer.uploadFile(new Archivo("file3","XLS","9gb"));
        fileServer.uploadFile(new Archivo("file4","MP4","3mb"));
        fileServer.uploadFile(new Archivo("file5","PDF","40mb"));

        fileServer.showAllFile();
    }

}
