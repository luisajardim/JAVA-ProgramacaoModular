package br.lpm.business;

import java.util.ArrayList;

public class OS {
private static int contador = 1;

private int id;
private String nomeCliente;
private ArrayList<Item> itens;
private float valorTotal;

public OS(String nomeCliente) {
this.itens = new ArrayList<>();
this.setNomeCliente(nomeCliente);
this.id = contador++;
}

public void setNomeCliente(String nomeCliente) {
this.nomeCliente = nomeCliente;
}

public String getNomeCliente() {
return nomeCliente;
}

public void addItem(Item item) {
itens.add(item);
}

public float calcularTotal() {
valorTotal = 0; // Resetar valorTotal antes de calcular
for (Item item : itens) {
valorTotal += item.getValor();
}
return valorTotal;
}

public int getNumItens() {
return itens.size();
}

public void exibirOS() {
System.out.println("Ordem: " + id);
System.out.println("Nome cliente: " + nomeCliente);
for (Item item : itens) {
System.out.println("Item: " + item.getDescricao());
}
System.out.println("Valor total: " + calcularTotal());
}
}