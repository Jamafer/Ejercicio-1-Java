/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad total de estudiantes: ");
        int totalEstudiantes = teclado.nextInt();
        System.out.print("Ingrese la cantidad de estudiantes por equipo: ");
        int estudiantesPorEquipo = teclado.nextInt();
        if (totalEstudiantes < 0 || estudiantesPorEquipo <= 0) {
            System.out.println("Error: ingrese cantidades validas.");
        } else {
            int equiposCompletos = totalEstudiantes / estudiantesPorEquipo;
            int estudiantesRestantes = totalEstudiantes % estudiantesPorEquipo;
            System.out.println("\nCantidad total de estudiantes: " + totalEstudiantes);
            System.out.println("Estudiantes por equipo: " + estudiantesPorEquipo);
            System.out.println("Se pueden formar " + equiposCompletos + " equipos completos.");
            System.out.println("Quedan " + estudiantesRestantes + " estudiantes sin integrar un equipo completo.");
        }
        teclado.close();
    }
}

