package Liga;

public class Equipo {
    int cod_Equipo, titulos;
    String nombre_Equipo, ciudad, mascota, nomina, entrenador;

    Equipo(String nombre_Equipo, int cod_Equipo) {
        this.nombre_Equipo = nombre_Equipo;
        this.cod_Equipo = cod_Equipo;
    }

    public void contratar() {
        System.out.println("El equipo contrata jugadores");
    }

    public void generar_entrenamiento() {
        System.out.println("EL equipo genera equipo");
    }

    public void jugar_torneos() {
        System.out.println("El equipo genera torneos");
    }

    public void ingresoEquipo(int titulos, String ciudad, String mascota) {

        this.titulos = titulos;
        this.ciudad = ciudad;
        this.mascota = mascota;
    }

    public String mostrarEquipo() {
        return "El equipo " + nombre_Equipo + "Es local en la ciudad" + ciudad +
                "tiene " + titulos + "en sus vitrinas y su mascota es" + mascota;
    }


}
