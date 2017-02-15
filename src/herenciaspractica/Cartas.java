package herenciaspractica;

public class Cartas {
    
    private String nombre;
    private Integer elixir;
    private Integer vida;

    public Cartas() {
    }

    public Cartas(String nombre, Integer elixir, Integer vida) {
        this.nombre = nombre;
        this.elixir = elixir;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getElixir() {
        return elixir;
    }

    public void setElixir(Integer elixir) {
        this.elixir = elixir;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
    
}
