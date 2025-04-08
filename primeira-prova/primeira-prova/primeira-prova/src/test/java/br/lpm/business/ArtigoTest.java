package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtigoTest {
public static Artigo artigo; 
@BeforeEach
public void setUp(){
    artigo = new Artigo("Coleira", TipoArtigo.NOVO, 100);
}
    @Test
    void testSetGarantiaNovo() {
    assertEquals(30,artigo.getGarantiaDias(), "garantia de um produto novo deve ser 30 dias");
    artigo.setGarantiaDias(10);
    assertEquals(30, artigo.getGarantiaDias(),"Nao é possivel atribuir uam garantia diferente de 30 para artigos novos");
    }

    @Test
    void testSetGarantiaUsado() {
        artigo.setTipo(TipoArtigo.USADO);
        artigo.setGarantiaDias(20);
        assertEquals(20,artigo.getGarantiaDias(), "garantia de um produto usado deve ser definido pelo fabricante");
        }
}
