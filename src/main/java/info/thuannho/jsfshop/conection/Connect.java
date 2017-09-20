package info.thuannho.jsfshop.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	public static final String usuario = "root";
	public static final String senha = "";
	public static final String url = "jdbc:mysql://localhost/cdcol";
	public static final String driver = "com.mysql.jdbc.Driver";
	
	
	public static Connection abrirConexao() throws Exception{
		
		//registrar o driver
		Class.forName(driver);
		
		//recupera conexao
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		
		//retorna conexao aberta
		return conn;
		
	}
		
		
		

			
			
			
			

	

}
