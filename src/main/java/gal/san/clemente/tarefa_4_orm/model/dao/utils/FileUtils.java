package gal.san.clemente.tarefa_4_orm.model.dao.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {
    public static void writeFile(String data, String url) {
        //Vamos comezar declarando o ficheiro
        File arquivo = new File(url);

        try {

            //Creamos un fluxo de saida para o arquivo
            FileOutputStream fileOut = new FileOutputStream(arquivo);
            ObjectOutputStream fluxoDatos = new ObjectOutputStream(fileOut);
            
            fluxoDatos.writeObject(data);
         
            //Temos que cerrar sempre o ficheiro
            fluxoDatos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static String getFileName(String name, String extension) {
       return "./" + Instant.now().toEpochMilli() + "_" + name + "." + extension;
    }
}
