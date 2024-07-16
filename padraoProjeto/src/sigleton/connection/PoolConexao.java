package sigleton.connection;

import java.util.ArrayList;
import java.util.List;



public class PoolConexao {
	private static PoolConexao sigleton = new PoolConexao();
	public static final int tamanho_Conexao = 2;
	
	private List<Conexao> listconexao = new ArrayList<Conexao>();
	
	public static PoolConexao getInstance() {
		return sigleton;
	}
	
	private PoolConexao() {
		System.out.println("criando o pool de conexao");
		
		
		for(int i=0; i< tamanho_Conexao; i++) {
			listconexao.add(new Conexao());
		}
		
	}
	
	
	public Conexao getConexao() {
		Conexao avaliar = null;
		
		for (Conexao conexao : listconexao) {
			if(!conexao.estaUso()) {
				avaliar = conexao;
				break;
			}
		}
		
		if(avaliar == null) {
			System.out.println("Não existe conexao");
			return null;
		}
		avaliar.setEmUso(true);
		return avaliar; 
	}
	
	public void liberarConexao(Conexao con) {
		con.setEmUso(false);
	}

}
