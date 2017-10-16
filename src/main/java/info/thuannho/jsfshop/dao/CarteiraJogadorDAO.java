package info.thuannho.jsfshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import info.thuannho.jsfshop.conection.Connect;
import info.thuannho.jsfshop.entity.CarteiraJogadorE;
import info.thuannho.jsfshop.entity.UsuarioE;

public class CarteiraJogadorDAO {
	
public List<CarteiraJogadorE> buscarJogosCarteira(UsuarioE usuario) throws Exception{
		
		StringBuilder sql = new StringBuilder();
				
		sql.append("SELECT J.NOME_JOGO, CC.NOME_CONSOLE, S.DSC_STATUS	");
		sql.append("FROM 	CLIENTE C	");
		sql.append("JOIN CARTEIRA_JOGADOR CJ ON C.ID_CLIENTE = CJ.ID_CLIENTE	");
		sql.append("JOIN JOGO J ON CJ.ID_JOGO = J.ID_JOGO	");
		sql.append("JOIN CONSOLE CC ON CC.ID_CONSOLE = J.ID_CONSOLE	");
		sql.append("JOIN STATUS_JOGO S ON S.ID_STATUS = CJ.ID_STATUS	");
		sql.append("WHERE CJ.ID_CLIENTE	= 6	");
		
		Connection con = Connect.abrirConexao();
		
		/*PreparedStatement ps = con.prepareStatement(sql.toString());
		ps.setString(1, usuario.getNome());*/
		
		PreparedStatement ps = con.prepareStatement(sql.toString());
		ResultSet resultSet = ps.executeQuery();
			
		String nomeJogo = resultSet.getString(1);
		String nomeConsole = resultSet.getString(2);
		String status = resultSet.getString(3); 
		
		CarteiraJogadorE carteiraJogador = new CarteiraJogadorE();
		
		carteiraJogador.setNomeJogo(nomeJogo);
		carteiraJogador.setNomeConsole(nomeConsole);
		carteiraJogador.setStatus(status);
		
		List<CarteiraJogadorE> carteiraJogadorLista = new ArrayList<CarteiraJogadorE>();
		
		while(resultSet.next()) {
			carteiraJogadorLista.add(carteiraJogador);
		}
		
		return carteiraJogadorLista;				
		
	}

}
