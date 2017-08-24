package info.thuannho.jsfshop;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.application.FacesMessage;

import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;

import info.thuannho.jsfshop.util.GeralUtil;

public abstract class MBeanBase implements Serializable{
	
	public boolean validarCamposObrigatorios(Object fieldValue, String fieldToValidateId, String fieldToValidateLabel) {
		
		Boolean isValid = true;
		
		if(fieldValue == null){
			isValid = false;
		}		
		
		if(fieldValue instanceof String) {
			if("".equals(fieldValue)) {
				isValid = false;
			}
		}
		
		if(fieldValue instanceof Integer) {
			if(new Integer(0).equals(fieldValue)) {
				isValid = false;
			}
		}
		
		if(fieldValue instanceof BigDecimal) {
			if(BigDecimal.ZERO.equals(fieldValue)) {
				isValid = false;
			}
		}
		
		if(fieldValue instanceof Long) {
			if(new Long(0).equals(fieldValue)) {
				isValid = false;
			}
		}
		
		if(!isValid) {
			exibirMensagemValidaCampos("form1:" + fieldToValidateId, fieldToValidateLabel);			
		}
		
		return isValid;
	}
	
	public void exibirMensagemValidaCampos(String fieldId, String fieldLabel) {
		
		 FacesMessage facesMessage =
                 new FacesMessage(FacesMessage.SEVERITY_ERROR, GeralUtil.getNomeCampo(fieldLabel, null) + ": ", null);                     
		
	}
	
	

}
