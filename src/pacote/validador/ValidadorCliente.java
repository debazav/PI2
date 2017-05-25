package pacote.validador;


import pacote.classes.Cliente;


public class ValidadorCliente {
    public static int validador (Cliente cliente){
        
        
        if (cliente == null) {
            return 1;
        }
        
        if (cliente.getNome() == null || "".equalsIgnoreCase(cliente.getNome())) {
            return 2;
        }
        
        if ( cliente.getCPF() == null || "".equalsIgnoreCase(cliente.getCPF())) {
            return 3;
        }
        
        if (cliente.getRG() == null || "".equalsIgnoreCase((cliente.getRG()))) { 
            return 4;
        }
        
        if (cliente.getSexo() == null || "".equalsIgnoreCase(cliente.getSexo()) || "escolher".equalsIgnoreCase(cliente.getSexo())) {
            return 5;
        }
        
        if (cliente.getBairro() == null || "".equalsIgnoreCase(cliente.getBairro())) {
            return 6;
        }
        
        if (cliente.getCEP()==null ||"".equalsIgnoreCase((cliente.getCEP())) ) { 
            return 7;
        }
        
        if (cliente.getCidade() == null || "".equalsIgnoreCase(cliente.getCidade())) {
            return 8;
        }
        
        
        if (cliente.getEmail() == null || "".equalsIgnoreCase(cliente.getEmail())) {
            return 9;
        }
        
        if (cliente.getEnd() == null || "".equalsIgnoreCase(cliente.getEnd())) {
            return 10;
        }
        
        if (cliente.getIdade() == null || "".equalsIgnoreCase(cliente.getIdade())) {
            return 11;
        }
        
        if (cliente.getTel() == null || "".equalsIgnoreCase(cliente.getTel())) {
            return 12;
        }
              
        return 0;
    }
}
