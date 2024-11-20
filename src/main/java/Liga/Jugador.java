package Liga;

public class Jugador {
    int id,edad,numero;
    String nombre,posicion;

    Jugador(int id,String nombre){
       this.id= id;
        this.nombre=nombre;

    }
    public void entrenar() {
        System.out.println("jugador puede jugar ");

    }

    public void jugar(){

    }
    public void ingresarDatosJugador(int edad,int numero,String posicion){
        this.edad = edad;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String mostrar(){
        return "el jugador"+ nombre+ "tiene"+ edad +
           "y porta en su camisa el numero "+ posicion+
                "y juega en la posicion"+ numero;
    }
}
