package ponte;
/**
 *
 * @author geovane
 */
public class Main {
    public static void main(String[] args) {
        Ponte p = new Ponte();
        
        Veiculo v1 = new Veiculo("Comum", p);
        Veiculo v2 = new Veiculo("Comum", p);
        Veiculo v3 = new Veiculo("Policia", p);
        Veiculo v4 = new Veiculo("Ambulancia", p);
        Veiculo v5 = new Veiculo("Comum", p);
        Veiculo v6 = new Veiculo("Comum", p);
        
        v4.setPriority(10);
        v3.setPriority(7);
        
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v6.start();
        
    }
}
