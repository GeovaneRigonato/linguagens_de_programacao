package onibus;
/**
 *
 * @author geovane
 */
public class ContadorPassagens {

	private int assentosDisponiveis = 42;

	public synchronized void reservarPassagem(String pname, int numeroAssentos) {
		if ((assentosDisponiveis >= numeroAssentos) && (numeroAssentos > 0)) {
			System.out.println(pname + ", reservou " + numeroAssentos+ " lugares com sucesso...");
			assentosDisponiveis = assentosDisponiveis- numeroAssentos;
		} else
			System.out.println(pname + ", nao foi possivel reservar "+numeroAssentos+" assentos...");
	}
}