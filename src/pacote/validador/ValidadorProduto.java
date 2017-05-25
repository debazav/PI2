//@autor Everton TADS B
package pacote.validador;

import pacote.classes.Produto;

public class ValidadorProduto {
    
    public static int validador(Produto produto){
        if(produto==null){
            return 1;
        }
        
        if(produto.getDesc()==null || "".equalsIgnoreCase(produto.getDesc())){
            return 2;
        }
        
        if(produto.getCat()==null || "".equalsIgnoreCase(produto.getCat()) || "escolher".equalsIgnoreCase(produto.getCat())){
            return 3;
        }
        
        if(produto.getMarca()==null || "".equalsIgnoreCase(produto.getMarca())){
            return 4;
        }
        
        if(produto.getModelo()==null || "".equalsIgnoreCase(produto.getModelo())){
            return 5;
        }
        
        if(produto.getCor()==null || "".equalsIgnoreCase(produto.getCor())){
            return 6;
        }
        
        if(produto.getQtde()==null || "".equalsIgnoreCase(produto.getQtde())){
            return 7;
        }
        
        return 0;
    }

}
