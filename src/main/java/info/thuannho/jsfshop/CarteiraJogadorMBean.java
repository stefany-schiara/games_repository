package info.thuannho.jsfshop;

import java.util.List;

import javax.faces.bean.ManagedBean;
//import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import info.thuannho.jsfshop.entity.CarteiraJogadorE;
import info.thuannho.jsfshop.entity.UsuarioE;
import info.thuannho.jsfshop.service.CarteiraJogadorService;

@ManagedBean
@SessionScoped
public class CarteiraJogadorMBean {
	
	CarteiraJogadorService carteiraService = new CarteiraJogadorService();
	
	private CarteiraJogadorE carteira;
	
	//@PostConstruct
	public void init() throws Exception {
		carteira = new CarteiraJogadorE();		
	}
	 
	private List<CarteiraJogadorE> jogos;
	 
	private UsuarioE usuario;	
	
	
	public List<CarteiraJogadorE> buscarJogosCarteira(UsuarioE usuario) throws Exception {
		
		return jogos = carteiraService.buscarJogosCarteira(usuario);
	}
	
	public CarteiraJogadorE getCarteira() {
		return carteira;
	}
	
	public void setCarteira(CarteiraJogadorE carteira) {
		this.carteira = carteira;
	}
	
	public List<CarteiraJogadorE> getJogos() {
		return jogos;
	}
	
	public void setJogos(List<CarteiraJogadorE> jogos) {
		this.jogos = jogos;
	}
	
	

}
