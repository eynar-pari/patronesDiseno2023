package singleton.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance = null;
    private static FileWriter writer;
    private String globalMsg="";
    private Logger(){
        File  logFile = new File("logFile.txt");
    }
    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void logger (String msg)  {
        //System.out.println(msg);
        globalMsg=globalMsg+msg+"\n";
    }

    public void closeWriter() throws IOException {
        try {
            writer = new FileWriter("logFile.txt");
            writer.write(globalMsg);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
