package listasDinamicas;

public class ListaCircularTeste {
	public static void main(String[] args) {
		ListaCircular minhaLista = new ListaCircular();
		
		minhaLista.inserirInicio(1);  //Inserindo no Inicio
		minhaLista.inserirInicio(22);
		minhaLista.inserirInicio(34);
		minhaLista.inserirInicio(75);
		
		minhaLista.inserirFim(120);    //inserindo no fim
		minhaLista.inserirFim(145);    //inserindo no fim
		minhaLista.inserirFim(179);    //inserindo no fim
		minhaLista.inserirFim(203);    //inserindo no fim



		
		minhaLista.remover(34);   //Removendo o valor 34 da lista
		minhaLista.imprimir();     //Imprimindo lista completa e a quantidade de itens contidos nela
	}
}
