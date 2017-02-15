
package herenciaspractica;


public class CartaEstr extends Cartas {
    
    private Integer defensa;

    public CartaEstr(String nombre, Integer elixir, Integer vida, Integer defensa) {
        super(nombre, elixir, vida);
        this.defensa = defensa;
    }

    public CartaEstr() {
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }
    
    
}
