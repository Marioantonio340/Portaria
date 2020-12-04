/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoacesso;

/**
 *
 * @author Administrador
 */
public class Comum implements Pessoa{

    @Override
    public void SolicitarAcesso() {
        System.out.println("Verificando se não há restrições...");
        new Porteiro().SolicitarAcesso();
    }
    
}
