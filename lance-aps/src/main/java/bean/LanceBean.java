package bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.LanceDAO;
import entidade.Lance;

@ManagedBean
public class LanceBean {
	private Lance lance = new Lance();
	private List<Lance> lista;
	
	public String salvar() {
		try {
			LanceDAO.salvar(lance);
			lance = new Lance();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo com Sucesso."));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Falha ao Salvar."));
		}
		
		return null;
	}

	public Lance getLance() {
		return lance;
	}

	public void setLance(Lance lance) {
		this.lance = lance;
	}

	public List<Lance> getLista() {
		if (lista == null) {
			lista = LanceDAO.listar();
		}
		return lista;
	}

	public void setLista(List<Lance> lista) {
		this.lista = lista;
	} 
}

