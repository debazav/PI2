/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.Mock;

import java.util.ArrayList;
import java.util.List;
import pacote.classes.Cliente;


public class MockCliente {
    private static  int totalCli = 0;    
    private static List<Cliente> listaCli = new ArrayList<Cliente>();
    
    public static void inserirCli (Cliente cliente){
       cliente.setIdCli(totalCli++);
       listaCli.add(cliente);
    }
    
    public static void atualizarCli (Cliente cliProcura){
        
        if (cliProcura != null && cliProcura.getIdCli() != null && listaCli.isEmpty() ) {
            for (Cliente cli : listaCli) {
                if (cli!=null && cli.getIdCli() == cliProcura.getIdCli()) {
                    cli.setBairro(cliProcura.getBairro());
                    cli.setCEP(cliProcura.getCEP());
                    cli.setCPF(cliProcura.getCPF());
                    cli.setCidade(cliProcura.getCidade());
                    cli.setComp(cliProcura.getComp());
                    cli.setEmail(cliProcura.getEmail());
                    cli.setEnd(cliProcura.getEnd());
                    cli.setIdade(cliProcura.getIdade());
                    cli.setNum(cliProcura.getNum());
                    cli.setRG(cliProcura.getRG());
                    cli.setTel(cli.getTel());
                    cli.setSexo(cliProcura.getSexo()); 
                }
            }
        }
    }
    
  public static List<Cliente> listar(){
        return listaCli;
    }
  
   public static List<Cliente> procurarCliente(String valor){
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if(valor!=null && !listaCli.isEmpty()){
            for(Cliente cli : listaCli){
                if(cli!=null && cli.getNome()!=null && 
                    cli.getCPF()!=null){
                    if(cli.getNome().toUpperCase().contains(valor.toUpperCase()) ||
                        cli.getCPF().toUpperCase().contains(valor.toUpperCase())){
                        listaResultado.add(cli);
                    }
                    
                }
            }
        }
        return listaResultado;
    }
   
   public static void excluir(Integer id) {
        if (id != null && !listaCli.isEmpty()) {
            for (int i = 0; i < listaCli.size(); i++) {
                Cliente clienteLi = listaCli.get(i);
                if (clienteLi != null && clienteLi.getIdCli()== id) {
                    listaCli.remove(i);
                    break;
                }
            }
        }
    }

   
    //Obtém um cliente da lista
    public static Cliente obter(Integer id)
            throws Exception {
        if (id != null && !listaCli.isEmpty()) {
            for (int i = 0; i < listaCli.size(); i++) {
                if (listaCli.get(i) != null && listaCli.get(i).getIdCli()== id) {
                    return listaCli.get(i);
                }                
            }
        }
        return null;
    }
    
}
