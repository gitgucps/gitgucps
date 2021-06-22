package projetorgc;

import javax.faces.bean.ManagedBean;

@ManagedBean(user="dataBean")
@RequestScoped


public class DataBean {
	
private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String user) {
		this.data = data;
	}

}
