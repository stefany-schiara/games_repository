package info.thuannho.jsfshop.util;

import javax.faces.context.FacesContext;

public class GeralUtil {
	
	public void exibirMensagemValidaCampos(){
		
	}
	
	public static String getNomeCampo(String labelId, Object params[]) {
		
		String bundleName = "label_pt_BR";
		
		return "Os campos " + bundleName + " n�o podem ter valores inv�lidos ou vazios" ;
	}

}
