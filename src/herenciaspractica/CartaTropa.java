
package herenciaspractica;


public class CartaTropa extends Cartas{

    private Integer ataque;

    public CartaTropa(String nombre, Integer elixir, Integer vida, Integer ataque) {
        super(nombre, elixir, vida);
        this.ataque = ataque;
    }

    public CartaTropa() {
    }
    
    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }
   
    
}
