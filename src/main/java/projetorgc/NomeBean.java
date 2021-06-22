package projetorgc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="nomeBean")
@RequestScoped
public class NomeBean {
	
	private String nome;
	private String user;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
			
			
		
	}
	
