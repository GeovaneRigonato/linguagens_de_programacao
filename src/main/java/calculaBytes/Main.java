
package calculaBytes;


import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {
       long inicio = System.currentTimeMillis();
        long size = NormalBytes.calcular(new File("/home/geovane/Desktop/TestaCalculo/"));
        long gastou = System.currentTimeMillis() - inicio;
        System.out.println("Modo convencional: ");
        System.out.println(size / 1024 + " Gastou: " + gastou);
        
        
        inicio = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        size = pool.invoke(new ThreadBytes(new File("/home/geovane/Desktop/TestaCalculo/")));
        gastou = System.currentTimeMillis() - inicio;
        System.out.println("Modo paralelo: ");
        System.out.println(size / 1024 + " Gastou: "+gastou);
                
    }

}
