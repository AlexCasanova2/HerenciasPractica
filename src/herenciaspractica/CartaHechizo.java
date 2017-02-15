
package herenciaspractica;

public class CartaHechizo extends Cartas {
    
    private Integer alcance;
    private boolean modo;

    public CartaHechizo(String nombre, Integer elixir, Integer vida, Integer alcance, boolean modo) {
        super(nombre, elixir, vida);
        this.alcance = alcance;
        this.modo = modo;
    }

    public CartaHechizo() {
    }
    

    public Integer getAlcance() {
        return alcance;
    }

    public void setAlcance(Integer alcance) {
        this.alcance = alcance;
    }

    public boolean isModo() {
        return modo;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }
    
    
    
}
