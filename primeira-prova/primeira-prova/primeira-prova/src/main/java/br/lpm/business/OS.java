package br.lpm.business;

public class OS {
    private static final int MAX_ITENS = 2;
    private static int contador = 1;

    private int id;
    private String nomeCliente;
    private Item itens[];
    private int numItens;
    private float valorTotal;
    
public OS(String nomeCliente){
    this.numItens=0;
    itens = new Item[MAX_ITENS];
    this.setNomeCliente(nomeCliente);
    this.id=contador++;
}

public void setNomeCliente(String nomeCliente) {
    this.nomeCliente=nomeCliente;
}

public String getNomeCliente() {
    return nomeCliente;
}

public void addItem(Item item){
    if(numItens<MAX_ITENS){
        itens[numItens]= item;
        numItens++;
    }
}

public float calcularTotal(){
    for(int pos=0; pos<numItens; pos++){
        valorTotal+=itens[pos].getValor();
    }
    return valorTotal;
}

public int getNumItens() {
    return numItens;
}

public void exibirOS(){
    System.out.println("ordem: " + id);
    System.out.println("Nome cliente:" + nomeCliente);
    for(int pos=0; pos<numItens; pos++){
        System.out.println("Itens: " + itens[pos].getDescricao());
    }
    System.out.println("Valor total: " + calcularTotal());

}
}
