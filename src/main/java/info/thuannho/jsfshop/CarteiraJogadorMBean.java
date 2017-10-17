package info.thuannho.jsfshop;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import info.thuannho.jsfshop.entity.CarteiraJogadorE;
import info.thuannho.jsfshop.entity.UsuarioE;
import info.thuannho.jsfshop.service.CarteiraJogadorService;

@ManagedBean
@SessionScoped
public class CarteiraJogadorMBean {
	
	CarteiraJogadorService carteiraService = new CarteiraJogadorService();
	
	private UsuarioE usuario;
	private CarteiraJogadorE carteira;
	
	@PostConstruct
	public void init() throws Exception {
		carteira = new CarteiraJogadorE();
		buscarJogosCarteira(usuario);
	}
	
	public List<CarteiraJogadorE> buscarJogosCarteira(UsuarioE usuario) throws Exception {
		
		return carteiraService.buscarJogosCarteira(usuario);
	}
	
	public CarteiraJogadorE getCarteira() {
		return carteira;
	}
	
	public void setCarteira(CarteiraJogadorE carteira) {
		this.carteira = carteira;
	}
	
	

}
