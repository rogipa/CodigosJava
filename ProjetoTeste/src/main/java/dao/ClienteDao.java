package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import basicas.Categoria;
import basicas.Cliente;

public class ClienteDao {
	
	EntityManager em = GetEntityManager.getJpaConnection();
	

	public void adiciona(Cliente c, Categoria categoria) {
		
		categoria.adiciona(c);
		
		em.getTransaction().begin();
		
		
		em.merge(categoria);
		
		em.getTransaction().commit();
		
		
		
	}
	
	public Cliente buscarClienteId (int id) {
		
		return em.find(Cliente.class, id);
		
	}
	
	public void atualizarCliente(Cliente c) {
		
		
		
		em.getTransaction().begin();
		
		em.merge(c);
		
		em.getTransaction().commit();
	}
	
	public List<Cliente> listarClientes() {
		
		return em.createQuery("select c from Cliente c order by c.nome", Cliente.class ).getResultList();
		
	}
	
	public List<Cliente> listarQuantidade(int qtd){
		
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c", Cliente.class);
		query.setMaxResults(qtd);
		return query.getResultList();
	
	}
	
	
	public Cliente procurarPorNome(String nome) {
		
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c where c.nome = :name", Cliente.class);
		query.setParameter("name", nome);
		
		return query.getSingleResult();
		
		
		
		
	}
	
	public List<Cliente> listarClienteCategoria(){
		
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c join c.categoria", Cliente.class);
		
		return query.getResultList();
		
	}
	
	public List<Cliente> listarClientesPorCategoria(){
		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c where c.categoria.descricao= :desccat",Cliente.class);
		query.setParameter("desccat", "Clientes Ativos");
		return query.getResultList();
	}
	


}
