/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculaBytes;

/**
 *
 * @author geovane
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
