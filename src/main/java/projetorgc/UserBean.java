package projetorgc;

import javax.faces.bean.ManagedBean;

@ManagedBean(user="userBean")
@RequestScoped

public class UserBean {
	
	private String user;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	

}
