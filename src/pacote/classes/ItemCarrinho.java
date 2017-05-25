/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.classes;

/**
 *
 * @author 609426
 */
public class ItemCarrinho {
    private Integer idIC;
    private Produto ic;
    private Integer quantidade;

    /**
     * @return the idIC
     */
    public Integer getIdIC() {
        return idIC;
    }

    /**
     * @param idIC the idIC to set
     */
    public void setIdIC(Integer idIC) {
        this.idIC = idIC;
    }

    /**
     * @return the ic
     */
    public Produto getIc() {
        return ic;
    }

    /**
     * @param ic the ic to set
     */
    public void setIc(Produto ic) {
        this.ic = ic;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
}
