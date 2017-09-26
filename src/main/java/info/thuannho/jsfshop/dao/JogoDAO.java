package info.thuannho.jsfshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import info.thuannho.jsfshop.conection.Connect;
import info.thuannho.jsfshop.entity.JogoE;

public class JogoDAO {
	
	public void cadastrarJogo(JogoE jogo) throws Exception{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO JOGO ");
		sql.append("VALUES(?, ?)");
		
		//Abre conexão
		Connection con = Connect.abrirConexao();
		
		PreparedStatement ps = con.prepareStatement(sql.toString());
		ps.setString(1, jogo.getNome());
	}

}
