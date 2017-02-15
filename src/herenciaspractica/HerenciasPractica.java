package herenciaspractica;
import tools.Fichero;
import tools.InputData;


public class HerenciasPractica {

    private static Lista_jugadores misJugadores;
    private static Lista_cartas misCartas;
    
    private static Fichero FicheroJugadores;
    private static Fichero FicheroCartas;
    
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        FicheroJugadores = new Fichero("jugadores.xml");
        misJugadores = (Lista_jugadores) FicheroJugadores.leer();
        if (misJugadores == null) {
            misJugadores = new Lista_jugadores();
        }
        
        Cartas carta = new Cartas();
        FicheroCartas = new Fichero("cartas.xml");
        misCartas = (Lista_cartas) FicheroCartas.leer();
        if (misCartas == null) {
            misCartas = new Lista_cartas();
        }
        
      
        int opcion;
        do{
            mostrarMenu();
            opcion = InputData.pedirEntero("Escoge una opcion");
            switch (opcion){
                case 1 : 
                    altaUsuario();
                    break;
                case 2 :
                   conseguirCartas();
                    break;
                case 3 :
                     batalla();
                    break;
                case 4 :
                    ranking();
                    break;
            }
        } while (opcion !=5);
    }
    
    public static void ranking(){
        
    }
    
    public static void batalla(){
        
    }
    
    public static void conseguirCartas(){
        
        String nombre;
        String contraseña;
        
        nombre= InputData.pedirCadena("Usuario:");
        contraseña = InputData.pedirCadena("Password:");
        Jugador jugador = misJugadores.encontrar(nombre);
        if(jugador==null){
            String res = InputData.pedirCadena("El usuario no existe, ¿Quieres crearlo?");
            if(res.equalsIgnoreCase("Si")){
                altaUsuario();
            }else if(res.equalsIgnoreCase("No")){
                mostrarMenu();
            } else{
                System.out.println("Debes responder Si o No");
            }
        }
        else{
            System.out.println("Has iniciado sesión");
            int contador=0;
            
             for(Cartas j : jugador.getCartas().getLista_cartas()){
                 contador++;
             }
             int n = 6 -contador;
             
             while(n >0){
                 for(Cartas j : misCartas.getLista_cartas()){
                     System.out.println("Nombre: " + j.getNombre() + " Coste elixir: "+ j.getElixir() + " Vida: " + j.getVida());
                     
                 }
                 
                String cartaN= InputData.pedirCadena("¿Que carta quieres?");
                 String cartaP = InputData.pedirCadena("¿Seguro que quieres esta carta?");
                 if(cartaP.equalsIgnoreCase("Si")){
                    for(Cartas c : jugador.getCartas().getLista_cartas()){
                        if(cartaN.equals(c.getNombre())){
                            System.out.println("Esta carta ya esta en tu baraja");
                        }
                        else{
                            Cartas carta = misCartas.encontrarCarta(cartaN);
                            if(carta==null){
                                System.out.println("Esta carta no existe");
                            }
                            }
                    }
                      Cartas carta = misCartas.encontrarCarta(cartaN);
                                jugador.getCartas().regisCarta(carta);
                                FicheroJugadores.grabar(misJugadores);
                                System.out.println("La carta se ha añadido a tu baraja, te quedan " + contador + "cartas por elegir");
                     
                }else if(cartaP.equalsIgnoreCase("No")){
                    mostrarMenu();
                } else{
                    System.out.println("Debes responder Si o No");
                }
                 
             }
        }
    }
    
    
    public static void altaCartas(){
        CartaTropa carta1 = new CartaTropa ("Mago",5,4,3);
        CartaTropa carta2 = new CartaTropa ("Rey",6,8,2);
        CartaTropa carta3 = new CartaTropa ("Dragón",7,5,7);
        
        CartaEstr carta4 = new CartaEstr ("Bombardero",6,4,4);
        CartaEstr carta5 = new CartaEstr ("Ballesta", 4,3,4);
        CartaEstr carta6 = new CartaEstr ("Vígia",4,5,5);
        
        CartaHechizo carta7 = new CartaHechizo ("Rayo",5,0,4,false);
        CartaHechizo carta8 = new CartaHechizo ("Curación",5,0,5,true);
        CartaHechizo carta9 = new CartaHechizo ("Veneno",6,0,4,false);
        
        misCartas.regisCarta (carta1);
        misCartas.regisCarta (carta2);
        misCartas.regisCarta (carta3);
        misCartas.regisCarta (carta4);
        misCartas.regisCarta (carta5);
        misCartas.regisCarta (carta6);
        misCartas.regisCarta (carta7);
        misCartas.regisCarta (carta8);
        misCartas.regisCarta (carta9);
        
        FicheroCartas.grabar(misCartas);
    }
    
    public static void altaUsuario(){
        String nombre = InputData.pedirCadena("Nombre: ");
        String contraseña = InputData.pedirCadena("Contraseña: ");
        Integer trofeos = 0;

        
        Jugador c = new Jugador(nombre, contraseña, trofeos);
        misJugadores.regisJugador(c);
        FicheroJugadores.grabar(misJugadores);
    }
    
    
     public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Crear Jugador");
        System.out.println("2. Conseguir cartas");
        System.out.println("3. Batalla");
        System.out.println("4. Ranking");
        System.out.println("5. Salir");
       
    }
    
}
