/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portaria;

import relatorio.Compactador;
import relatorio.Crypt;
import relatorio.Relatorio;
import relatorio.RelatorioPDF;
import relatorio.ImprimirRelatorio;
import tipoacesso.Porteiro;
import temperatura.Observador;
import temperatura.TelaDetalhada;
import temperatura.TelaPainel;
import temperatura.Termometro;
import tipoacesso.Comum;
import tipoacesso.Pessoa;

/**
 *
 * @author mario
 */
public class Portaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OBSERVER
         
        Termometro termometro = new Termometro();
        termometro.setTemperatura(40);
        Observador telaDetalhada = new TelaDetalhada();
        termometro.adicionaObservador(telaDetalhada);
        Observador telaPainel = new TelaPainel();
        termometro.adicionaObservador(telaPainel);
        termometro.notificarTodos();
 

        //BRIDGE
                Relatorio relatorio = new RelatorioPDF();
//        relatorio.setPosProcessador(new Crypt());
        relatorio.gerarRelatorio();
        relatorio.setPosProcessador(new Compactador());
        relatorio.gerarRelatorio();
        relatorio.setPosProcessador(new Crypt());
        relatorio.gerarRelatorio();
        relatorio = new ImprimirRelatorio();

        
             
        //PROXY
    Comum comum = new Comum();
    comum.SolicitarAcesso();


    }
    
}
