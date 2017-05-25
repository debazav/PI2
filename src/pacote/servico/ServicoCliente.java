package pacote.servico;

import java.util.List;
import javax.swing.JOptionPane;
import pacote.Mock.MockCliente;
import pacote.classes.Cliente;
import pacote.validador.ValidadorCliente;

public class ServicoCliente {

    public static void cadastrarCliente(Cliente cliente) {

        int erro = ValidadorCliente.validador(cliente);
        
        
        
        if (erro == 0) {

            try {
               MockCliente.inserirCli(cliente);
               JOptionPane.showMessageDialog(null, "Cadastro realizado!");

            } catch (Exception e) {                
                JOptionPane.showMessageDialog(null, e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            if (erro == 2) {
                JOptionPane.showMessageDialog(null, "Campo nome inválido.");
            } else if (erro == 3) {
                JOptionPane.showMessageDialog(null, "Campo CPF inválido.");
            } else if (erro == 4) {
                JOptionPane.showMessageDialog(null, "Campo RG inválido.");
            } else if (erro == 5) {
                JOptionPane.showMessageDialog(null, "Escolha uma das opções no campo Sexo.");
            } else if (erro == 6 ) {
                JOptionPane.showMessageDialog(null, "Campo Bairro inválido.");
            } else if (erro == 7) {
                JOptionPane.showMessageDialog(null, "Campo CEP inválido.");
            } else if (erro == 8) {
                JOptionPane.showMessageDialog(null, "Campo Cidade inválido.");
            } else if (erro == 9) {
                JOptionPane.showMessageDialog(null, "Campo E-mail inválido.");
            } else if (erro == 10) {
                JOptionPane.showMessageDialog(null, "Campo Endereço inválido.");
            } else if (erro == 11) {
               JOptionPane.showMessageDialog(null, "Campo Idade inválido."); 
            } else if (erro == 12) {
                JOptionPane.showMessageDialog(null, "Campo Telefone inválido.");
            } else if (erro == 13) {
                JOptionPane.showMessageDialog(null, "Caracteres inválidos em campo CPF, digite apenas números.");
            } else if (erro == 14) {
                JOptionPane.showMessageDialog(null, "Há muitos caracteres no campo CPF");
            }
            
          
        }
        
        
    }
    
    public static List<Cliente> procurarCliente(String procura){
        try{
            if(procura==null || "".equalsIgnoreCase(procura)){
                return MockCliente.listar();
            }else{
                return MockCliente.procurarCliente(procura);
            }
        }catch(Exception e){
            
        }
        return procurarCliente(procura);
     
    }
    
    public static void excluirCliente(Integer id)
             {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            MockCliente.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente.");
            
        }
    }
    
    //Atualiza um cliente na fonte de dados
    public static void atualizarCliente(Cliente cliente){
        
        //Chama o validador para verificar o cliente
        ValidadorCliente.validador(cliente);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockCliente.atualizarCli(cliente);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
       
        }
    }

    public static Cliente obterCliente(Integer id) {
        try {
            //Retorna o cliente obtido com o DAO
            return MockCliente.obter(id);
            
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            JOptionPane.showMessageDialog(null, e);
        }
        return null; //????????????????????????????????????????????????????
    }

}
