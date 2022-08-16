/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculaBytes;

/**
 *
 * @author geovane
 */
/* Normal Bytes se tem um metodo calcular definido, onde nele se recebe um arquivo como argumento, onde se inicia como tamanho inicial 0
   Fazemos um if para se verificar se o arquivo é realmente um arquivo, caso seja size recebe seu tamanho
   Se não criamos um lista com nome arqs onde nessa lista se recebe todos os arquivos presentes no caminho passado,
   No if se verifica se a lista desses arquivos é diferente de null, se for diferente ele chama novamente a função para fazer essa verificação novamente.
   Apos calcular todo o conteudo passado ele retorna o tamanho.
*/
import java.io.File;

public class NormalBytes {

  public static long calcular(File file) {
    long size = 0;

    if (file.isFile()) {
      size = file.length();
    } else {
        
      File[] arqs = file.listFiles();
      if (arqs != null) {
        for (File arq : arqs) {
          size += NormalBytes.calcular(arq);
        }
      }
    }
    return size;
  }
}
