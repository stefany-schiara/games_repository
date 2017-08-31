package info.thuannho.jsfshop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import info.thuannho.jsfshop.entity.UsuarioE;

@ManagedBean
@RequestScoped
public class CadastroMBean {	
	
	private UsuarioE usuario;
	private String confirmaSenha;
	private String mensagem;
	int erro;
			
	FacesContext context = FacesContext.getCurrentInstance();
	
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
		
		validarCampos();
        
		if(erro != 0) {
        	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Erro", "Bora salvar"));
        } 
        else {
        	context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível cadastrar usuário"));
        }
        
    }
	
	public void validarCampos() {		
		
		if(usuario.getNome() == null || usuario.getNome().isEmpty()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Campo nome não pode ser vazio"));
			erro += 0;
		}
		
		if(usuario.getNome().length() < 3) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Nome deve possuir mais de 3 caracteres"));
			erro += 0;
		}
		
		if(usuario.getUserName()  == null || usuario.getUserName().isEmpty()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Campo usuário não pode ser vazio"));
			erro += 0;
		}
		
		if(usuario.getUserName().length() < 3) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Usuário deve possuir mais de 3 caracteres"));
			erro += 0;
		}
		
		if(usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Informe uma senha"));
			erro += 0;	
		}
		
		if(usuario.getSenha().length() < 5) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Senha não pode ser menor que 5 caracteres"));
			erro += 0;
		}
		
		if(usuario.getSenha().equals(confirmaSenha)) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "As senhas não conferem"));
			erro += 0;
		}
		
		if(usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Campo email não pode ser vazio"));
			erro += 0;
		}
		
		if(!validarEmail()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "null", "Informe um e-mail válido"));
			erro += 0;
		}
		
		else {	
			erro += 1;
		}
		
	}
	
	
	public boolean validarEmail() {
		
		String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(usuario.getEmail());
		
		return false;
	}
	

	public UsuarioE getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioE usuario) {
		this.usuario = usuario;
	}	

}
