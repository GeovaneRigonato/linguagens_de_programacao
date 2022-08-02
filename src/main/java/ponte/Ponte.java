package ponte;
/**
 *
 * @author geovane
 */
public class Ponte {
    
    public synchronized void atravessarPonte(Veiculo v) throws InterruptedException{
        System.out.println(v.getName()+ " esta passando");
        Thread.sleep(1000);
        System.out.println("");
    }
}
