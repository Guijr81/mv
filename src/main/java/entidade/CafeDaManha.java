package entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CAFE_MANHA")
public class CafeDaManha {

	@Id
	@Column(name = "ID", nullable = false)
	private long id;
	@Column(name = "DATA", nullable = false)
	private Date data;
	
	@OneToMany(mappedBy = "cafeDaManha", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CafeItem> listaItens;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<CafeItem> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<CafeItem> listaItens) {
		this.listaItens = listaItens;
	}
}
