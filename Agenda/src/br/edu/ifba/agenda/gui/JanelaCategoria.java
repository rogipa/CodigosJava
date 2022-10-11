package br.edu.ifba.agenda.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import br.edu.ifba.agenda.basicas.Categoria;
import br.edu.ifba.agenda.cadastros.CadastroCategoria;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.exception.CadastroCategoriaException;

public class JanelaCategoria extends JPanel {
	private JTextField txtCategoria;
	private JTable tabelaCategoria;
	/**
	 * Create the panel.
	 */
	public JanelaCategoria() {
		setLayout(null);
		setBounds(10, 11, 451, 396);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(192, 192, 192), new Color(64, 64, 64), null));
		panel.setBounds(10, 11, 431, 78);
		add(panel);
		panel.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCategoria c = new CadastroCategoria();
				Categoria cat = new Categoria();
				cat.setNome(txtCategoria.getText());
				try {
					c.adicionarCategoria(cat);
				}catch(CadastroCategoriaException e2) {
					return;
				}
					
			
			
			}
		});
		btnSalvar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/salvar.png")));
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalvar.setBounds(10, 11, 105, 56);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/editar.png")));
		btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEditar.setBounds(125, 11, 95, 56);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(230, 11, 95, 56);
		btnExcluir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnExcluir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnExcluir.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/excluir.png")));
		panel.add(btnExcluir);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(335, 11, 89, 56);
		btnAtualizar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/atualizar.png")));
		btnAtualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAtualizar.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnAtualizar);
		
		JLabel lblNomeCategoria = new JLabel("Nome Categoria:");
		lblNomeCategoria.setBounds(10, 100, 86, 14);
		add(lblNomeCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(10, 119, 276, 20);
		add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 169, 431, 216);
		add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 411, 194);
		panel_1.add(scrollPane);

	}
}
