package br.lpm.business;

public abstract class Item {
    protected float valor;


public Item(float valor){
    this.setValor(valor);
}

public void setValor(float valor){
    if(valor>0){
        this.valor=valor;
    }
}

public float getValor(){
    return valor;
}

public abstract String getDescricao();

}

