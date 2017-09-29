package info.thuannho.jsfshop;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import info.thuannho.jsfshop.entity.ConsoleE;
import info.thuannho.jsfshop.service.ConsoleService;

@ManagedBean
@RequestScoped
public class ConsoleMBean {
	
	ConsoleService consoleService = new ConsoleService();

	private ConsoleE console;
	
	@PostConstruct
	public void init() {
		console = new ConsoleE();
	}
	
	public ConsoleE getConsole() {
		return console;
	}
	
	public void setConsole(ConsoleE console) {
		this.console = console;
	}	
	
	public void cadastrarConsole() throws Exception{
		
		consoleService.cadastrarConsole(console);
	}
	
}
