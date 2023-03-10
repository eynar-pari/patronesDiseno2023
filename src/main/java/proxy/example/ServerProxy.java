package proxy.example;


public class ServerProxy implements  IServer{
   private FileServer fileServerPDF;
   private FileServer fileServerOthers;

    public ServerProxy(String ip, String port, String size) {
        this.fileServerPDF = new FileServer(ip,port,size);
        this.fileServerOthers = new FileServer("10.10.10.8","9091","5TB");
    }

    @Override
    public void uploadFile(Archivo file) {

        if (file.getExtention().toLowerCase().equals("pdf")){
            System.out.println("Guardando archivo ..."+file.getName()+"."+file.getExtention());
            this.fileServerPDF.uploadFile(file);
        }else{
            System.out.println(">>> Este Archivo no cumple con el requemientos, se guardara en un servidor tmp: "+file.getName()+"."+file.getExtention());
            this.fileServerOthers.uploadFile(file);
        }
    }

    public void showAllFile(){
        System.out.println("Archivos Guardados en el servidor >>");
        for (Archivo archivo:this.fileServerPDF.getStore()
             ) {
            archivo.show();
        }

    }
}
