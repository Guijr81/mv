package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_CAFE_MANHA")
public class CafeItem {

	@Id
	@Column(name = "ID", nullable = false)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "CPF_COLABORADOR", referencedColumnName = "CPF", nullable = true)
	private Colaborador colaborador;
	
	@OneToOne
	@JoinColumn(name = "NOME_PRODUTO", referencedColumnName = "NOME", nullable = true)
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "ID_CAFE_MANHA", referencedColumnName = "ID", nullable = true)
	private CafeDaManha cafeDaManha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public CafeDaManha getCafeDaManha() {
		return cafeDaManha;
	}

	public void setCafeDaManha(CafeDaManha cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

}
