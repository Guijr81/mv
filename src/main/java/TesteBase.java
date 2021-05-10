import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Colaborador;
import util.JpaUtil;

public class TesteBase {

	public static void main(String[] args) {Util.getEntityManager();
		
		Colaborador c = new Colaborador();
		c.setCpf("111.111.111-11");
		c.setNome("Guilherme Dos Santos");
		
		EntityTransaction ts = ent.getTransaction();
		ts.begin();
		
		ent.persist(c); //salvando no bando de dados com o JPA
		
		ts.commit();
		ent.close();

	}

}
