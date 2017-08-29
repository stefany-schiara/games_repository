package info.thuannho.jsfshop.entity;

import java.util.Calendar;

public class UsuarioE {
	
	private String nome;
	private String userName;
	private String senha;
	private String email;
	//private Calendar dataAtual = Calendar.getInstance();
	

	public UsuarioE() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
