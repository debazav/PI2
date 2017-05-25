/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.Mock;

import java.util.ArrayList;
import java.util.List;
import pacote.classes.ItemCarrinho;
import pacote.classes.Produto;
import pacote.classes.Venda;


/**
 *
 * @author 609426
 */
public class MockVendas {

    private static int totalVendas = 0;
    private static List<Venda> vendas = new ArrayList<Venda>();

    public static void inserirVenda(Venda venda) {
        venda.setIdVenda(totalVendas++);
        int seqProduto = 0;
        for (ItemCarrinho produto : venda.getCarrinho()) {
            produto.setIdIC(seqProduto++);//dentro do carrinho cada item terá seu ID
            
        }

        vendas.add(venda);

    }

}
