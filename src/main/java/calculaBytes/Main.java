
package calculaBytes;


import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Main {
    // Declara uma variavel para se armazenar a hora que o programa começa a ser executado, depois passamos caminho a ser aberto com os arquivos// 
    // NormalBytes é uma classe onde um contrutor retorna um arquivo//
    // Se divide por por 1024 pois se quer ter o resultado em Kbytes assim se transforma da base bytes pra Kbytes//
    public static void main(String[] args) {
       long inicio = System.currentTimeMillis();
        long size = NormalBytes.calcular(new File("C:\\Users\\Breno Menegueli\\Desktop\\linguagens_de_programacao-main\\TestaCalculo"));
        long gastou = System.currentTimeMillis() - inicio;
        System.out.println("Normal: ");
        System.out.println(size / 1024 + " Tempo de Execução: " + gastou);
       
    //Executa a mesma função mas a unica diferença é o metodo ForkJoinPool que tem varios metodos dentro dele//
    //Devido ao metodo FOrkJOinPool é possivel passar o metodo invoke onde nele se pode esperar a execução do programa pra gerar o resultado//
        inicio = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        size = pool.invoke(new ThreadBytes(new File("C:\\Users\\Breno Menegueli\\Desktop\\linguagens_de_programacao-main\\TestaCalculo")));
        gastou = System.currentTimeMillis() - inicio;
        System.out.println("Paralelo: ");
        System.out.println(size / 1024 + " Tempo de Execução: "+gastou);
                
    }

}
