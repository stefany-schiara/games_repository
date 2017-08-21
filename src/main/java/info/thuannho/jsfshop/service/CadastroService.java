package info.thuannho.jsfshop.service;

import info.thuannho.jsfshop.entity.UsuarioE;

public class CadastroService {
	
	public void cadastrar(UsuarioE usuario) throws Exception  {	
		
		if(validar(usuario)) {
			//dao.salvar(usuario);
		}
		
		
		
	}
	
	public boolean validar(UsuarioE usuario) throws Exception {
			
		if (usuario.getNome().length() < 5) {
			
			
		}			
		
		return false;
	}

}
