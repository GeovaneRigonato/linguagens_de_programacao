
package onibus;
/**
 *
 * @author geovane
 */
public class Main {
    
    public static void main(String[] args) {
        ContadorPassagens contadorPassagens = new ContadorPassagens();
        ReservaPassagens t1 = new ReservaPassagens(contadorPassagens,"Merlinzada",1);
        ReservaPassagens t2 = new ReservaPassagens(contadorPassagens,"Geovane",2);
        ReservaPassagens t3 = new ReservaPassagens(contadorPassagens,"Jhonatan",4);
        ReservaPassagens t4 = new ReservaPassagens(contadorPassagens,"GabrielLimamaro",3);
        ReservaPassagens t5 = new ReservaPassagens(contadorPassagens,"JoaoLourenzola",4);
        ReservaPassagens t6 = new ReservaPassagens(contadorPassagens,"Graucola",2);
        ReservaPassagens t7 = new ReservaPassagens(contadorPassagens,"Gabriel",1);
        ReservaPassagens t8 = new ReservaPassagens(contadorPassagens,"Fulano",1);
        ReservaPassagens t9 = new ReservaPassagens(contadorPassagens,"Cicrano",1);
        ReservaPassagens t10 = new ReservaPassagens(contadorPassagens,"Batatinha 1.58",1);
        ReservaPassagens t11 = new ReservaPassagens(contadorPassagens,"Beltrano",1);
        ReservaPassagens t12 = new ReservaPassagens(contadorPassagens,"DonaKunegundes",1);
        ReservaPassagens t13 = new ReservaPassagens(contadorPassagens,"Tianinho",2);
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        
    }
}
