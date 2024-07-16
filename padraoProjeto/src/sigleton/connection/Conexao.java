package sigleton.connection;

public class Conexao {
	private boolean EmUso;
	
	public Conexao() {
		EmUso = false;
	}
	
	public Object query(String sql) {
		System.out.println("execultando "+sql+" com conexao "+this);
		return null;
	}
	
	boolean estaUso() {
		return EmUso;
	}
	
	public void setEmUso(boolean status) {
		this.EmUso = status;
	}

}
