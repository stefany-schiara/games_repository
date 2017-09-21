package info.thuannho.jsfshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import info.thuannho.jsfshop.conection.Connect;
import info.thuannho.jsfshop.entity.UsuarioE;

public class ClienteDAO {
	
	public void cadastrarCliente(UsuarioE usuario) throws Exception{
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO CLIENTE ");
		sql.append("VALUES(?, ?, ?, ?, ?)");
		
		//Abre conexao
		Connection conn = Connect.abrirConexao();
		
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ps.setString(1, "seq_cliente.nextval");
		ps.setString(2, usuario.getNome());
		ps.setString(3, usuario.getEmail());
		ps.setString(4, usuario.getSenha());
		ps.setString(5, usuario.getUserName());
		
		ps.executeQuery();
		
		ps.close();
		conn.close();
		
	}

}
