package info.thuannho.jsfshop.service;


import info.thuannho.jsfshop.dao.UsuarioDAO;
import info.thuannho.jsfshop.entity.UsuarioE;



public class UsuarioService {

	UsuarioDAO clienteDAO = new UsuarioDAO();
	
	public void cadastrar(UsuarioE usuario) throws Exception  {	
		
		
		//if(validar(usuario)) {
			clienteDAO.cadastrarCliente(usuario);
		//}		
		
	} 

}
