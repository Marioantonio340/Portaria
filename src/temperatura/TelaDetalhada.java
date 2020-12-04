/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

/**
 *
 * @author Administrador
 */
public class TelaDetalhada implements Observador{

    @Override
    public void notificar(Termometro termometro) {
        System.out.println("Pessoa solicita entrada");
        System.out.println("Medindo temperatura");
    }
    
}
