package Lista;

import Basica.Celula;


public class ListaDuplamente {
	
	int totalElementos = 0;
	Celula cabeca;
	Celula calda;
	
	public void adicionaComeco(Object objeto) {
		
		if(this.totalElementos == 0) {
			
			Celula nova = new Celula (objeto);
			
			this.cabeca = nova;
			
			this.calda = nova;
			
			this.totalElementos++;
			
		}else {
			
			Celula nova = new Celula(this.cabeca, objeto);
			this.cabeca.setAnterior(nova);
			this.cabeca = nova;
			this.totalElementos++;
			
		}
		
		
	}
	
	public void adiciona(Object objeto) {
		
		if(this.totalElementos == 0) {
			adicionaComeco(objeto);
		}else {
			
			Celula nova = new Celula(objeto);
			nova.setAnterior(this.calda);
			this.calda.setProxima(nova);
			this.calda = nova;
			
			this.totalElementos++;
			
			
		}
		
		
	}
	
	public void imprimir() {
		
		Celula impress = this.cabeca;
		
		for(int cont=0; cont<this.totalElementos - 1; cont++) {
			
			System.out.print(impress.getObjeto()+ " - ");
			
			impress = impress.getProxima();
			
			
			
		}
		 System.out.print(impress.getObjeto());
		 
		 System.out.println(" ");
		
		
	}
	

}
