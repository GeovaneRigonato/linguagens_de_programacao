package ponte;
/**
 *
 * @author geovane
 */
public class Veiculo extends Thread {
    Ponte ponte;
    
    public Veiculo(String nome, Ponte p){
        this.setName(nome);
        this.ponte = p;
    }
    
    @Override
    public void run(){
        try {
            ponte.atravessarPonte(this);
        } catch (InterruptedException ex) {
            
        }
    }
   
    
}