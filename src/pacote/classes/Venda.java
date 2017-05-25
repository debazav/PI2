/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.classes;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author 609426
 */
public class Venda {
    private Integer idVenda;
    private ArrayList<ItemCarrinho> carrinho = new ArrayList<>();
    private Cliente cliente;
    private Date dataDaVenda;
    
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the idVenda
     */
    public Integer getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the carrinho
     */
    public ArrayList<ItemCarrinho> getCarrinho() {
        return carrinho;
    }

    /**
     * @param carrinho the carrinho to set
     */
    public void setCarrinho(ArrayList<ItemCarrinho> carrinho) {
        this.carrinho = carrinho;
    }

    /**
     * @return the dataDaVenda
     */
    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    /**
     * @param dataDaVenda the dataDaVenda to set
     */
    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
   
    
    
}
