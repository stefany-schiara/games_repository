package info.thuannho.jsfshop;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import info.thuannho.jsfshop.entity.ConsoleE;
import info.thuannho.jsfshop.service.ConsoleService;

@ManagedBean
@SessionScoped
public class ConsoleMBean {
	
	ConsoleService consoleService = new ConsoleService();

	private ConsoleE console;
	
	@PostConstruct
	public void init() {
		console = new ConsoleE();
	}	
		
	public void cadastrarConsole(ActionEvent actionEvent) throws Exception{
		System.out.println(" ################# Cadastro Console cadastrarConsole################# ");
		consoleService.cadastrarConsole(console);
	}	
	
	
	public ConsoleE getConsole() {
		return console;
	}
	
	public void setConsole(ConsoleE console) {
		this.console = console;
	}	
}
