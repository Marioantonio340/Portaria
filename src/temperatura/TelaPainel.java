/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

/**
 *
 * @author Administrador
 */
public class TelaPainel implements Observador {

    @Override
    public void notificar(Termometro termometro) {
        System.out.println("Notif painel");
        if (termometro.getTemperatura() > 38) {
            System.out.println("ACESSO NEGADO, TEMPERATURA "+termometro.getTemperatura()+",ESTADO FEBRIL, SUSPEITA DE COVID");
        } else {
            System.out.println("ACESSO PERMITIDO, TEMPERATURA NORMAL");
        }

    }
}
