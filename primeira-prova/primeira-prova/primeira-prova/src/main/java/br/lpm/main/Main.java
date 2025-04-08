package br.lpm.main;

import java.time.LocalDateTime;

import br.lpm.business.Artigo;
import br.lpm.business.OS;
import br.lpm.business.ServicoPet;
import br.lpm.business.ServicoPetShop;
import br.lpm.business.TipoArtigo;

public class Main {
    public static void main(String[] args) {
        ServicoPet servicoPet= new ServicoPet(ServicoPetShop.BANHO, LocalDateTime.of(2000, 10, 10, 12, 21, 12), "carlos", 100.0f);

        Artigo artigo = new Artigo("coleira", TipoArtigo.USADO, 10);
        

        OS os = new OS("jose");
        artigo.setGarantiaDias(10);
        os.addItem(artigo);
        os.addItem(servicoPet);
        os.exibirOS();
        

    }
}