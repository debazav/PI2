//@autor Everton TADS B
package pacote.servico;

import java.util.List;
import javax.swing.JOptionPane;
import pacote.Mock.MockProduto;
import pacote.classes.Produto;
import pacote.validador.ValidadorProduto;

public class ServicoProduto {

    public static void cadastrarProduto(Produto produto) {
        int erro = ValidadorProduto.validador(produto);

        if (erro == 0) {
            try {
                MockProduto.inserirProduto(produto);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } catch (Exception e) {

            }

        } else {
            switch (erro) {
                case 2:
                    JOptionPane.showMessageDialog(null, "Descrição em branco");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Escolha alguma Categoria");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Marca em branco");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Modelo em branco");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Cor em branco");
                    break;

                case 7:
                    String qtd = produto.getQtde();
                    if (produto.getQtde().equals("")) {
                        JOptionPane.showMessageDialog(null, "Quantidade em branco");
                    } else {
                        try {
                            Integer.parseInt(qtd);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Valor não numérico no campo Quantidade");
                        }
                    }

            }
        }
    }

    public static List<Produto> procurarProduto(String desc) {
        try {
            if (desc == null || "".equalsIgnoreCase(desc)) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(desc);
            }
        } catch (Exception e) {

        }
        return procurarProduto(desc);
    }

    //Obtem o quarto com ID informado do mock
    public static Produto obterQuarto(Integer id) {
        try {
            //Retorna o quarto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
return null;
        }
        
    }

}
