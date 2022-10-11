package br.edu.ifba.agenda.cadastros;

import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifba.agenda.basicas.Categoria;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.exception.CadastroCategoriaException;

public class CadastroCategoria {
	
	ColecaoCategoria col = new ColecaoCategoria();
	
	public void adicionarCategoria(Categoria c) throws CadastroCategoriaException  {
		
		if(col.procurarCategoriaNome(c.getNome())!=null) {
			CadastroCategoriaException ex = new CadastroCategoriaException(c.getNome());
			throw(ex);
		}
		
		this.col.adicionarCategoria(c);
		
		
	}
	
	public void atualizarCategoria(Categoria c) {
		col.atualizarCategoria(c);
	}
	
	public List<Categoria> listarCategorias(){
		return col.listarCategorias();
	}
	
	public Categoria procurarCategoriaId(int id) {
		return col.procurarCategoriaId(id);
	}
	
	public Categoria procurarCategoriaNome(String nome) {
		return col.procurarCategoriaNome(nome);
	}
	
	public void removerCategoria(Categoria c) {
		col.removerCategoria(c);
	}

}
