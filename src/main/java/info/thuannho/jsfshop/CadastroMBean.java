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
public class CadastroMBean extends MBeanBase{
	
	private static final long serialVersionUID = 7851699081121470530L;
	
	private UsuarioE usuario;
	private String confirmaSenha;
	private String mensagem;
	private boolean validar;
	
		
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
		
		if(usuario.getNome() == null || usuario.getNome().equals(""))
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Campo nome não pode ser vazio"));
		
		if(usuario.getNome().length() > 3)
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "O campo nome deve possuir o mínimo de 3 caracteres"));
		
		if(usuario.getUserName().isEmpty() || usuario.getUserName().equals(""))
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Campo usuário não pode ser vazio"));
		
		if(usuario.getNome().length() > 3)
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Minimo de 3 caracteres para o campo nome"));
		
			
		
	}
	

	public UsuarioE getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioE usuario) {
		this.usuario = usuario;
	}
	
	

}
