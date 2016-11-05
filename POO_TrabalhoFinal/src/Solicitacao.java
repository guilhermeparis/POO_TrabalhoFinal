
public class Solicitacao {

	private Celular c;
	private String msg;
	
	public Celular getC() {
		return c;
	}
	
	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "Celular: "+ c + ", Mensagem: " + msg;
	}

}
