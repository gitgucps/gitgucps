package projetorgc;

import javax.faces.bean.ManagedBean;

@ManagedBean(user="senhaBean")
@RequestScoped

public class SenhaBean {
	
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String user) {
		this.senha = senha;
	}

}
