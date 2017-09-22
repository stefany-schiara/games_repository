package info.thuannho.jsfshop.service;

import javax.inject.Inject;

import info.thuannho.jsfshop.dao.ClienteDAO;
import info.thuannho.jsfshop.entity.UsuarioE;


public class CadastroService {

	ClienteDAO clienteDAO;
	
	public void cadastrar(UsuarioE usuario) throws Exception  {	
		
		clienteDAO = new ClienteDAO();
		//if(validar(usuario)) {
			clienteDAO.cadastrarCliente(usuario);
		//}
		
		
		
	}
	
	public boolean validar(UsuarioE usuario) throws Exception {
			
		if (usuario.getNome().length() < 5) {
			
			
		}			
		
		return false;
	}

}
