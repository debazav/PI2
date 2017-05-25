/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.servico;

import pacote.Mock.MockVendas;
import pacote.classes.ItemCarrinho;
import pacote.classes.Produto;
import pacote.classes.Venda;

/**
 *
 * @author 609426
 */
public class ServicoVendas {

    public static void inserirProdutoCarrinho(Venda venda) {
        try {
            //Marca os quartos da reserva como alugados
            for (ItemCarrinho itemcarrinho : venda.getCarrinho()) {
                Produto produtoAdicionado = itemcarrinho.getIc();

            }
            //Realiza a chamada de inserção na fonte de dados
            MockVendas.inserirVenda(venda);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();

        }

    }

}
