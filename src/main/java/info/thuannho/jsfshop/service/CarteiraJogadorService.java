package info.thuannho.jsfshop.service;

import java.util.List;

import info.thuannho.jsfshop.dao.CarteiraJogadorDAO;
import info.thuannho.jsfshop.entity.CarteiraJogadorE;
import info.thuannho.jsfshop.entity.UsuarioE;

public class CarteiraJogadorService {
	
	CarteiraJogadorDAO carteiraDAO = new CarteiraJogadorDAO();
	
	public List<CarteiraJogadorE> buscarJogosCarteira(UsuarioE usuario) throws Exception {
		
		return carteiraDAO.buscarJogosCarteira(usuario); 
	}

}
