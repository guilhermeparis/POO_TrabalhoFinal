
public class Central {
	public int processadores;
	public long tempoMin;
	public long tempoMax;

	public int getProcessadores() {
		return processadores;
	}
	public long getTempoMin() {
		return tempoMin;
	}
	public long getTempoMax() {
		return tempoMax;
	}
	@Override
	public String toString() {
		return "Central [processadores=" + processadores + ", tempoMin=" + tempoMin + ", tempoMax=" + tempoMax + "]";
	}
	
	

}
