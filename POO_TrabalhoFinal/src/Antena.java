import java.util.Queue;

public class Antena {

	private int capSimultanea;
	private int capFila;
	private int capTotal = capSimultanea + capFila;
	private Queue<Solicitacao> fila;
	
	public Antena(int capSimultanea, int capFila) {
		this.capSimultanea = capSimultanea;
		this.capFila = capFila;
	}

	public int getCapSimultanea() {
		return capSimultanea;
	}
		
	public int getCapFila() {
		return capFila;
	}
	
	public int getCapTotal() {
		return capTotal;
	}

	@Override
	public String toString() {
		return "Antena [capSimultanea=" + capSimultanea + ", capFila=" + capFila + ", capTotal=" + capTotal + "]";
	}
	
	
}
