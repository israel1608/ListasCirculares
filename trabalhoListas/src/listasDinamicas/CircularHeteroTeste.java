package listasDinamicas;

public class CircularHeteroTeste {

	public static void main(String[] args) {
        CircularHetero minhaLista = new CircularHetero();
		
		minhaLista.inserirInicio(1);  //Inserindo no Inicio
		minhaLista.inserirInicio("segundo");
		minhaLista.inserirInicio("terceiro");
		minhaLista.inserirInicio(75.99999);
		
		minhaLista.inserirFim(-120);    //inserindo no fim
		minhaLista.inserirFim(145);    //inserindo no fim
		minhaLista.inserirFim(179);    //inserindo no fim
		minhaLista.inserirFim(203);    //inserindo no fim



		
		minhaLista.remover(203);   //Removendo o valor 34 da lista
		minhaLista.imprimir();     //Imprimindo lista completa e a quantidade de itens contidos nela

	}

}
