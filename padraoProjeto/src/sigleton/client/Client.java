package sigleton.client;

import sigleton.connection.Conexao;
import sigleton.connection.PoolConexao;

public class Client {
	public static void query1() {
		PoolConexao pool = PoolConexao.getInstance();
		Conexao conexao = pool.getConexao();
		if(conexao != null) 
			conexao.query("SELECT * FROM QUERY 1");
		
	}
	public static void query2() {
		PoolConexao pool = PoolConexao.getInstance();
		Conexao conexao = pool.getConexao();
		if(conexao != null) 
			conexao.query("SELECT * FROM QUERY 2");
		//pool.liberarConexao(conexao);
		
		
	}
	public static void query3() {
		PoolConexao pool = PoolConexao.getInstance();
		Conexao conexao = pool.getConexao();
		if(conexao != null) 
			conexao.query("SELECT * FROM QUERY 3");
		
	}

	public static void main(String[] args) {
		System.out.println("tamanho da conexao "+PoolConexao.tamanho_Conexao);
		
		int pool = PoolConexao.tamanho_Conexao;
		System.out.println(pool); 
		
		query1();
		query2();
		
		query3();
		
	}

}
