package onibus;
/**
 *
 * @author geovane
 */
public class ReservaPassagens extends Thread {

	private final ContadorPassagens contadorPassagens;
	private final String nomePassageiro;
	private final int numeroAssentosReservar;

	public ReservaPassagens(ContadorPassagens contadorPassagens,String nomePassageiro, int numeroAssentosReservar) {
		this.contadorPassagens = contadorPassagens;
		this.nomePassageiro = nomePassageiro;
		this.numeroAssentosReservar = numeroAssentosReservar;
	}
	
        @Override
	public void run() {
		contadorPassagens.reservarPassagem(nomePassageiro, numeroAssentosReservar);
	}
}