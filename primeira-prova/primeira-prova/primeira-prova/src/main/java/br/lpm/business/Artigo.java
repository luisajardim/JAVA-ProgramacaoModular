package br.lpm.business;

public class Artigo extends Item {
    private String descricaoVenda;
    private int garantiaDias;
    private TipoArtigo tipo;

    //Caso seja Usado
    public Artigo(String descricaoVenda, TipoArtigo tipo, float valor) {
        super(valor);
        this.setDescricaoVenda(descricaoVenda);
        this.setTipo(tipo);
        this.setGarantiaDias(garantiaDias);
    }

    
    public void setGarantiaDias(int garantiaDias) {
        if(tipo==TipoArtigo.NOVO){
            this.garantiaDias = 30;
        }
        else{
            this.garantiaDias = garantiaDias;
        }
        
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public int getGarantiaDias() {
        return garantiaDias;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    @Override
    public String getDescricao() {
        return "Descricao da venda " + descricaoVenda + tipo + "Garantia: " + garantiaDias
                + "Valor " + getValor();
    }

    public void setTipo(TipoArtigo tipo) {
        this.tipo = tipo;
    }
}
