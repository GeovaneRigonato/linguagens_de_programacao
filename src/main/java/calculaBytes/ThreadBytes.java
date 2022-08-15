package calculaBytes;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author geovane
 */


public class ThreadBytes extends RecursiveTask<Long>{
    
    private File file;

    public ThreadBytes(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ThreadBytes(File[] file) {
        
    }
    

    @Override
    protected Long compute() {
        if(file.isFile()){
            return file.length();
        }else{
            File[] arqs = file.listFiles();
            if(arqs != null){
                return ThreadBytes.invokeAll(criarSubtarefas(arqs)).stream().mapToLong(ThreadBytes::join).sum();
            }
        }
        return null;
    }
    
    private Collection<ThreadBytes> criarSubtarefas(File[] arqs) {
        
        List<ThreadBytes> subtarefas = new ArrayList<>();
        
        for(int i = 0; i < arqs.length; i++){
            subtarefas.add(new ThreadBytes(arqs[i])); 
        }
        
        
        
        return subtarefas;
    }
    
    
}
