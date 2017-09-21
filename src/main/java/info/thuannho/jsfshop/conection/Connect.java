package info.thuannho.jsfshop.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	public static final String usuario = "postgres";
	public static final String senha = "postgres";
	public static final String url = "jdbc:postgresql://localhost:5432/games";
	public static final String driver = "org.postgresql.Driver";
	
	
	public static Connection abrirConexao() throws Exception{
		
		//registrar o driver
		Class.forName(driver);
		
		//recupera conexao
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		
		//retorna conexao aberta
		return conn;
		
	}
		
		
		

			
			
			
			

	

}
