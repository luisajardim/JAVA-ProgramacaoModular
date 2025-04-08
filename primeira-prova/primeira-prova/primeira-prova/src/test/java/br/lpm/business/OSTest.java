package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OSTest {
    public static OS os;
    public static Artigo artigo;
    public static ServicoPet servicoPet;
    @BeforeEach
    public void setUp(){
        os = new OS("gabi");
        artigo = new Artigo("coleira", TipoArtigo.USADO, 10.0f);
        servicoPet= new ServicoPet(ServicoPetShop.BANHO, LocalDateTime.of(2000, 10, 10, 12, 21, 12), "carlos", 100.0f);    
    }
    @Test
    void testAddItem() {
        os.addItem(artigo);
        os.addItem(artigo);
        assertEquals(2, os.getNumItens(),"deve ter 2 itens apos adicionar 2 vezes" );
        os.addItem(artigo);
        assertEquals(2,os.getNumItens(),"ao execer o numero maximo de itens o sistema nao ira armazenar mais nenhum");
    }

    @Test
    void testCalcularTotal() {
        os.addItem(artigo);
        os.addItem(servicoPet);
        assertEquals(110, os.calcularTotal(),"o valor retornado deve ser igual ao da soma de todos os itens adicionados");
        
    }
}
