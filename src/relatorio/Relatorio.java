/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public abstract class Relatorio {
    public Relatorio() {
        System.out.println("Criando relatorio");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RelatorioPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private PosProcessador posProcessador = new NaoFazNada();
    //template
    public void gerarRelatorio(){
        buscarDados();
        calcular();
        exportar();
        posProcessar();
    }
    //strategy
    public void posProcessar(){
        posProcessador.posProcessar();
    }
    private void buscarDados(){
        System.out.println("Buscando dados ...");
    }
    private void calcular(){
        System.out.println("Calculando ...");
    }
    protected abstract void exportar();
    
    public void setPosProcessador(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }
}
