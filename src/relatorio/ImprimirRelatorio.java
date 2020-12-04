/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

/**
 *
 * @author Administrador
 */
public class ImprimirRelatorio extends Relatorio{

    @Override
    protected void exportar() {
        System.out.println("Imprimindo Relatório...");
    }
    
}
