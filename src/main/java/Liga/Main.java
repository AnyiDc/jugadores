package Liga;
import java.util.Scanner;
public class Main {


    public static void main(String []args ){
      /*  Scanner sc = new Scanner(System.in);
        String cristiano = "Cristiano";
        Jugador jugador1= new Jugador(10,"cristiano" );
        Equipo equipo1 = new Equipo("deportivo J",100);
        System.out.println( equipo1.nombre_Equipo);
        equipo1.nombre_Equipo = "equipo k";
        System.out.println(equipo1.nombre_Equipo);*/
        Operaciones op =new Operaciones(10,20);
        Operaciones op2 = new Operaciones(10.5,20.5);


        System.out.println("la suma de los numeros enteros es "+ op.suma( 10,20)); //envio de los argumentos para ejecutar el metodo suma
        System.out.println("la suma de los numeros double es " + op2.suma( 10.5,20.5));
    }
}
