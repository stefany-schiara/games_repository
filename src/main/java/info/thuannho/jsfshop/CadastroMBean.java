package info.thuannho.jsfshop;

import info.thuannho.jsfshop.entity.UsuarioE;

public class CadastroMBean {
	
	private UsuarioE usuario;
	private String confirmaSenha;
	
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	
	public void cadastrarUsuario() {
		
		validarCampos();
	}
	
	private boolean validarCampos() {
		
		if(usuario.getSenha() != confirmaSenha) {
			//return ?? 
		}
		
		return true;
	}

}
