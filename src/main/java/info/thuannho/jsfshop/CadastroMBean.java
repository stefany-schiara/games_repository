package info.thuannho.jsfshop;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import info.thuannho.jsfshop.entity.UsuarioE;
import info.thuannho.jsfshop.service.CadastroService;



@ManagedBean
@RequestScoped
public class CadastroMBean {
	
	private UsuarioE usuario;
	private String confirmaSenha;
	private String mensagem;
	
		
	FacesContext context = FacesContext.getCurrentInstance();
	
	CadastroService service;
	
	@PostConstruct
	public void init() {
		usuario = new UsuarioE();
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public String getmensagem() {
        return mensagem;
    }
 
    public void setmensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    	
	public void cadastrarUsuario() {
			try {
				if(validarCamposCadastrar()) {
					service.cadastrar(usuario);
				}
			} catch (Exception e) {
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível cadastrar o usuário"));
			}
	}
	
	
	
	public boolean validarCamposCadastrar() {
		
			if (!usuario.getSenha().equals(confirmaSenha)) {
				
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "As senhas estão diferentes"));
			}
				return false;				
	}

	public UsuarioE getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioE usuario) {
		this.usuario = usuario;
	}
	
	

}
