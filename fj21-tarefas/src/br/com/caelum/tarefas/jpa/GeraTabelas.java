package br.com.caelum.tarefas.jpa;

//import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {
	
	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.
	createEntityManagerFactory("tarefas");
//	EntityManager emanager = factory.createEntityManager();
//	emanager.getTransaction().begin();
	factory.close();
	
	}
}
