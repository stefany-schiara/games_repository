package info.thuannho.jsfshop;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titlePage = "cadastro.xhtml";

    @PostConstruct
    public void init() {
    }
	
	public String getTitlePage() {
		return titlePage;
	}

	public void setTitlePage(String titlePage) {
		this.titlePage = titlePage;
	}
	
	public String redirectCadastro() {
        return "cadastro.xhtml";
    }

}
