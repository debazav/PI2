//@autor Everton TADS B
package pacote.Mock;

import java.util.ArrayList;
import java.util.List;
import pacote.classes.Produto;

public class MockProduto {
    
    private static List<Produto> listaProduto = new ArrayList<Produto>();
    
    public static void inserirProduto(Produto produto){
        listaProduto.add(produto);
    }
    
    public void atualizarProduto(Produto procuraProduto){
        if(procuraProduto != null && listaProduto.isEmpty()){
            for(Produto produto : listaProduto){
                if(produto!=null){
                    produto.setDesc(procuraProduto.getDesc());
                    produto.setCat(procuraProduto.getCat());
                    produto.setMarca(procuraProduto.getMarca());
                    produto.setModelo(procuraProduto.getModelo());
                    produto.setCor(procuraProduto.getCor());
                    produto.setQtde(procuraProduto.getQtde());
                }
            }
        }
    }
    
    public static List<Produto> listar(){
        return listaProduto;
    }
    
    public static List<Produto> procurar(String valor){
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if(valor!=null && !listaProduto.isEmpty()){
            for(Produto produtoLista : listaProduto){
                if(produtoLista!=null && produtoLista.getDesc()!=null && 
                    produtoLista.getMarca()!=null){
                    if(produtoLista.getDesc().toUpperCase().contains(valor.toUpperCase()) ||
                        produtoLista.getMarca().toUpperCase().contains(valor.toUpperCase())){
                        listaResultado.add(produtoLista);
                    }
                    
                }
            }
        }
        return listaResultado;
    }
     public static Produto obter(Integer id)
             {
        if (id != null && !listaProduto.isEmpty()) {
            for (int i = 0; i < listaProduto.size(); i++) {
                if (listaProduto.get(i) != null && listaProduto.get(i).getIdProduto().equals(id)) {
                    return listaProduto.get(i);
                }                
            }
        }
        return null;
    }

}
