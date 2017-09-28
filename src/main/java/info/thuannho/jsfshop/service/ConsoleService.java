package info.thuannho.jsfshop.service;

import info.thuannho.jsfshop.dao.ConsoleDAO;
import info.thuannho.jsfshop.entity.ConsoleE;

public class ConsoleService {
	
	ConsoleDAO consoleDao = new ConsoleDAO();
	
	public void cadastrarConsole(ConsoleE console) throws Exception{
		
		consoleDao.cadastrarConsole(console);
		
	}

}
