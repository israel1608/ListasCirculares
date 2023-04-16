package listasDinamicas;

public class CircularHetero{
	No2 inicio,fim;
	int tamanho;
	
	public CircularHetero() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public void inserirInicio(Object num) {
		No2 novo = new No2(num);
		
		if(novo != null) {
			novo.proximo = inicio;
			inicio = novo;
			
			if(fim == null) {
				fim = novo;
			}			
		fim.proximo = inicio;
		tamanho++;
		
		}else {
			System.out.println("Erro ao adicionar Nó");
		}
		
	}
	
	public void inserirFim(Object num) {
		No2 novo = new No2(num);
		
		if (novo != null) {
			if(inicio == null) {
				inicio = novo;
				fim = novo;
				fim.proximo = inicio;
			}else {
				fim.proximo = novo;
				fim = novo;
				novo.proximo = inicio;
			}
			tamanho++;
			
		}else {
			System.out.println("Erro ao adicionar Nó");
		}
		
	}
	
	public No2 remover(Object num) {
		No2 aux,remover = null;
		if(inicio != null) {
			if (inicio == fim && inicio.valor == num) {				
				remover = inicio;
				inicio = null;
				fim = null;
				tamanho--;				
			}else if (inicio.valor == num) {
				remover = inicio;
				inicio = remover.proximo;
				fim.proximo = inicio;
				tamanho--;
			}else {
				aux = inicio;
				while (aux.proximo != inicio && aux.proximo.valor != num) {
					aux = aux.proximo;
				}
				if (aux.proximo.valor == num) {
					if (fim == aux.proximo) {
						remover = aux.proximo;
						aux.proximo = remover.proximo;
						fim = aux;
					}else {
						remover = aux.proximo;
						aux.proximo = remover.proximo;
					}
					tamanho--;
				}
			}
		}
		return remover;
	}
	
	public void imprimir() {
		No2 no = inicio;
		System.out.println("\ntamanho da lista: "+tamanho);
		
		do {
			System.out.println(no.valor.toString());
			no = no.proximo;
			
		} while (no != inicio);
		System.out.println("Inicio: "+ no.valor.toString());
	}

}

