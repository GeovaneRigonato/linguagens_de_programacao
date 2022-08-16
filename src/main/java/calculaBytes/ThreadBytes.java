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
 /*
   Na classe ThreadBytes se cria um variavel File do tipo file, instancia o contrutor, get ,set.
   No metodo Long compute
    .invokeAll permite que voce possa realizar mais de uma tarefa ao mesmo tempo, no caso ele recebe como argumento o metodo(criarSubtarefas(arqs))
    (criarSubtarefas(arqs)) esse metodo recebe a lista de arquivos no caminho passado.
    .stream ele transforma cada elemento a fim dele realizar alguma interação seja filtragem, mapeamento, transformação, etc.
    .mapToLong faz uma transformação de todos os elementos de uma lista para o tipo long.
    .sum() a cada interação realizada no .stream ele realiza uma soma. 
    criarSubtarefas ele cria uma tarefa para cada arquivo da lista.
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
