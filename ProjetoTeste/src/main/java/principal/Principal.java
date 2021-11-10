package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import basicas.Categoria;
import basicas.Cliente;
import dao.CategoriaDao;
import dao.ClienteDao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Categoria c = new Categoria("Categoria Teste");
		Categoria c1 = new Categoria("Teste 2");*/
		//Categoria c3 = new Categoria("Clientes Ativos");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa");
		EntityManager em = emf.createEntityManager();
		
	    ClienteDao cd = new ClienteDao();
	    CategoriaDao cat = new CategoriaDao();
		
		Categoria categoria = cat.buscarCategoriaId(2);
		
		
		
		
		//System.out.println(categoria.getDescricao());
		
	    Cliente cl = new Cliente(); 
		/*cl.setNome("Josef");
		cl.setEmail("josef@teste.com.br");
		cl.setEndereco("rua Batatinha");
		cl.setFone("123");*/
	    
	    //cl = cd.buscarClienteId(2);
	    
	    //cl.setNome("Teste Update");
	    
	    //cd.atualizarCliente(cl);
	    
	   cd.listarClientesPorCategoria().forEach(System.out::println);
		
	    //System.out.println(cd.procurarPorNome("Fulano"));
		
		
		//cd.adiciona(cl, categoria);
		
		
		
		
		
		
		
		
		
	/*	em.getTransaction().begin();
		
		categoria.adiciona(cl);
	
		
		em.getTransaction().commit();*/
		
		//categoria.getClientes().forEach(System.out::println);
		
	//	Cliente cliente = em.find(Cliente.class, 5);
		
	//	System.out.println(cliente.getCategoria().getDescricao());
		
		//System.out.println(cliente.getCategoria().getDescricao());
		//categoria.getClientes().forEach(System.out::println);
		//System.out.println(categoria.getClientes().get(0));
		System.out.println("Cadastrou!!");
		

	}

}
