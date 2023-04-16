package listasDinamicas;

public class ListaCircular{
	No inicio,fim;
	int tamanho;
	
	public ListaCircular() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}
	
	public void inserirInicio(int num) {
		No novo = new No(num);
		
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
	
	public void inserirFim(int num) {
		No novo = new No(num);
		
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
	
	public No remover(int num) {
		No aux,remover = null;
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
		No no = inicio;
		System.out.println("\ntamanho da lista: "+tamanho);
		
		do {
			System.out.println(no.valor);
			no = no.proximo;
			
		} while (no != inicio);
		System.out.println("Inicio: "+ no.valor);
	}

}








// CODIGO PARA DEIXA A IMPRESSÃO EM UM FORMATO MAIS CIRCULAR

/*
public void imprimir() {
    No no = inicio;
    int largura = 5; // largura da célula
    int altura = 3; // altura da célula
    int margem = 1; // espaço entre células
    int linhas = tamanho / 3 + 1; // número de linhas da matriz
    int colunas = 3; // número de colunas da matriz
    int centroLinha = linhas / 2; // linha central da matriz
    int centroColuna = colunas / 2; // coluna central da matriz
    String[][] matriz = new String[linhas][colunas];
    
    // preencher a matriz com os valores dos nós da lista
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (no != null) {
                if (i == centroLinha && j == centroColuna) {
                    matriz[i][j] = String.format("%-" + largura + "s", "");
                } else {
                    matriz[i][j] = String.format("%-" + largura + "s", no.valor);
                    no = no.proximo;
                }
            } else {
                matriz[i][j] = String.format("%-" + largura + "s", "");
            }
        }
    }
    
    // imprimir a matriz
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            System.out.print(matriz[i][j]);
            for (int k = 0; k < margem; k++) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
*/









