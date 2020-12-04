/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Termometro {
    private List<Observador> listaDeObservadores = new ArrayList<>();
    private float temperatura;
    private float temperaturaAnterior;

    public float getTemperaturaAnterior() {
        return temperaturaAnterior;
    }

    public void setTemperaturaAnterior(float temperaturaAnterior) {
        this.temperaturaAnterior = temperaturaAnterior;
    }

    
    
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperaturaAnterior = this.temperatura;
        this.temperatura = temperatura;
    }
    
    
    public void adicionaObservador(Observador o){
        listaDeObservadores.add(o);
    }
    public void notificarTodos(){
        for(Observador o:listaDeObservadores){
            o.notificar(this);
        }
    }
    
    
    
    
    
}
