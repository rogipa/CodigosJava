package principal;

import br.edu.ifba.agenda.basicas.Contato;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.colecao.ColecaoContato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Categoria c = new Categoria("Negócios");
		ColecaoCategoria cg = new ColecaoCategoria();
		ColecaoContato cc = new ColecaoContato();
		
		
		
	//	cg.adicionarCategoria(c);
		
	//	cg.listarCategorias().forEach(System.out::println);
		
	/*	Contato c = new Contato();
		c.setNome("Igor Teste");
		c.setEmail("igortestecosta@gmail.com");
		c.setFone("323456");
		c.setCelular("999964656");
		c.setCategoria(cg.procurarCategoriaId(1));
		
		cc.adicionarContato(c);*/
		
		//cc.listarContato().forEach(System.out::println);
		
		cc.listarContatoPorCategoria(cg.procurarCategoriaId(2)).forEach(System.out::println);
		
		
		System.out.println(cc.procurarId(1));
		

	}

}
