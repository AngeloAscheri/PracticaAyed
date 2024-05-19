package ejercicio3;

import java.sql.Array;
import java.util.ArrayList;

public class Test {

    public static void main (String[]args){

        Profesor prof1 = new Profesor();
        prof1.setApellido("Gonzales");prof1.setNombre("Pepe");prof1.setEmail("pepe@gmail.com");
        prof1.setCatedra("matematica");prof1.setFacultad("exactas");

        Profesor prof2 = new Profesor();
        prof2.setApellido("Rodriguez");prof2.setNombre("Hugo");prof2.setEmail("hugo@gmaiil.com");
        prof2.setCatedra("SO");prof2.setFacultad("informatica");

        Profesor prof3 = new Profesor();
        prof3.setNombre("Ramon");prof3.setApellido("Moreno");prof3.setEmail("ramon@gmail.com");
        prof3.setCatedra("sociologia");prof3.setFacultad("humanidades");

        Estudiante est1 = new Estudiante();
        est1.setNombre("nicolas");est1.setApellido("Guitierrez");est1.setEmail("nicolas@gmail.com");
        est1.setComision(22);est1.setDireccion("2 44");

        Estudiante est2 = new Estudiante();
        est2.setNombre("Lucas");est2.setApellido("Lopez");est2.setEmail("luca@gmail.com");
        est2.setComision(13);est2.setDireccion("3 54");


        ArrayList<Estudiante> ListaEstudiantes = new ArrayList<Estudiante>();
        ListaEstudiantes.add(est1);ListaEstudiantes.add(est2);

        ArrayList<Profesor> ListaProfesores = new ArrayList<Profesor>();
        ListaProfesores.add(prof1);ListaProfesores.add(prof2);ListaProfesores.add(prof3);

    }

}
