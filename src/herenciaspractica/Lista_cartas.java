
package herenciaspractica;

import java.io.Serializable;
import java.util.ArrayList;


public class Lista_cartas implements Serializable {
    
    private ArrayList<Cartas> lista_cartas;
    
    public Lista_cartas() {
        lista_cartas = new ArrayList<>();
    }
    
    public void regisCarta (Cartas p){
        lista_cartas.add(p);
    }

    public ArrayList<Cartas> getLista_cartas() {
        return lista_cartas;
    }

    public void setLista_cartas(ArrayList<Cartas> lista_cartas) {
        this.lista_cartas = lista_cartas;
    }

    public Cartas encontrarCarta(String nombre){
        for(Cartas carta: lista_cartas){
            if(carta.getNombre().equals(nombre)){
                return carta;
            }
        }
        return null;
    }
}
