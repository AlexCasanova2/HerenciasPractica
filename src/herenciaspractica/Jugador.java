package herenciaspractica;
import java.util.ArrayList;

public class Jugador {
    
    private String nombre;
    private String contraseña;
    private Integer trofeos;
    private Lista_cartas cartas;

    public Jugador() {
    }

    public Jugador(String nombre, String contraseña, Integer trofeos) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.trofeos = trofeos;
        
        cartas = new Lista_cartas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContrasña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(Integer trofeos) {
        this.trofeos = trofeos;
    }

    public Lista_cartas getCartas() {
        return cartas;
    }

    public void setCartas(Lista_cartas cartas) {
        this.cartas = cartas;
    }
}
