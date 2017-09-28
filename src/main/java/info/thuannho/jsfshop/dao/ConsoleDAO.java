package info.thuannho.jsfshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import info.thuannho.jsfshop.conection.Connect;
import info.thuannho.jsfshop.entity.ConsoleE;

public class ConsoleDAO {
	
	public void cadastrarConsole(ConsoleE console) throws Exception{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO CONSOLE	");
		sql.append("VALUES(?, ?)	");
		
		//Abre conexao
		Connection con = Connect.abrirConexao();
		
		PreparedStatement ps = con.prepareStatement(sql.toString());
		ps.setString(1, console.getNome());
		ps.setString(2, console.getVersao());
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}

}
