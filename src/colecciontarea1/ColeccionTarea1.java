/*
Tarea basada en el proyecto.
 */
package colecciontarea1;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                                 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("\n");
        System.out.println("APELLIDOS Y NOMBRES: AGUAIZA QUIMBITA JONATHAN FABRICIO");
        System.out.println("CARRERA: INGENIERÍA AUTOMOTRIZ");
        System.out.println("ASIGNATURA: PROGRAMACIÓN");
        System.out.println("NRC: 7450");
        System.out.println("\n");
        System.out.println("              Tares de Colección           ");
        System.out.println("\n");
        Collection materialesProyecto = new ArrayList<String>();
        materialesProyecto.add("\n Diagrama del circuito ");
        materialesProyecto.add("\n Una tabla triplex de 50 centimetros en cuadro ");
        materialesProyecto.add("\n Luces de altas y bajas ");
        materialesProyecto.add("\n Rele de altas ");
        materialesProyecto.add("\n Rele de bajas ");
        materialesProyecto.add("\n Socket para las luces ");
        materialesProyecto.add("\n Socket para las los rele ");
        materialesProyecto.add("\n Interructor trifasico ");
        materialesProyecto.add("\n Seis metros de Alambre Automotriz ");
        materialesProyecto.add("\n Rele de bajas ");
        materialesProyecto.add("\n Fusibles ");
        materialesProyecto.add("\n Porta fusibles ");
        materialesProyecto.add("\n Taipe ");
        materialesProyecto.add("\n Bornes ");
        materialesProyecto.add("\n Bateria de 12 V ");
        materialesProyecto.add("\n Multimetro Automotriz \n");
        System.out.println("Número de componente utilizados para realizar el proyecto: "+
                materialesProyecto.size());
        System.out.println("LOS COMPONENTES SON: ");
        System.out.println(materialesProyecto.toString());
        materialesProyecto.remove("\n Diagrama del circuito ");
        materialesProyecto.remove("\n Seis metros de Alambre Automotriz ");
        materialesProyecto.remove("\n Taipe ");
        materialesProyecto.remove("\n Multimetro Automotriz \n");
        materialesProyecto.remove("\n Una tabla triplex de 50 centimetros en cuadro ");
        System.out.println("Número de componentes después de ser eliminados: Diagrama del circuito, Seis metros de Alambre Automotriz, Taipe,\n"
                + "La tabla triplex de 50 centimetros en cuadro y el Multimetro Automotriz: "
        +materialesProyecto.size());
        System.out.println("LOS COMPONENTES UTILIZADOS PARA REALIZAR LA SIMULACIÓN SON: ");
        System.out.println(materialesProyecto.toString());
    }
    
}