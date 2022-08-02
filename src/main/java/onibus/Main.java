
package onibus;
/**
 *
 * @author geovane
 */
public class Main {
    
    public static void main(String[] args) {
        ContadorPassagens contadorPassagens = new ContadorPassagens();
        ReservaPassagens t1 = new ReservaPassagens(contadorPassagens,"Merlin",2);
        ReservaPassagens t2 = new ReservaPassagens(contadorPassagens,"Geovane",3);
        ReservaPassagens t3 = new ReservaPassagens(contadorPassagens,"Jhonatan",4);
        ReservaPassagens t4 = new ReservaPassagens(contadorPassagens,"GabrielLima",5);
        ReservaPassagens t5 = new ReservaPassagens(contadorPassagens,"JoaoLourenzo",6);
        ReservaPassagens t6 = new ReservaPassagens(contadorPassagens,"Glauco",4);
        ReservaPassagens t7 = new ReservaPassagens(contadorPassagens,"Gabriel",3);
        ReservaPassagens t8 = new ReservaPassagens(contadorPassagens,"Fulano",4);
        ReservaPassagens t9 = new ReservaPassagens(contadorPassagens,"Cicrano",5);
        ReservaPassagens t10 = new ReservaPassagens(contadorPassagens,"Batata",6);
        ReservaPassagens t11 = new ReservaPassagens(contadorPassagens,"Beltrano",1);
        ReservaPassagens t12 = new ReservaPassagens(contadorPassagens,"DonaKunegundes",3);
        ReservaPassagens t13 = new ReservaPassagens(contadorPassagens,"NomePessoa",2);
        
        
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
