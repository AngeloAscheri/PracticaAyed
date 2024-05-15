package ejercicio3;

import java.sql.Array;
import java.util.ArrayList;

public class Test {

    public static void main (String[]args){

        Profesor prof1 = new Profesor("Pepe", "Gonzales","pepe@gmail.com",
                "matematica","exactas");
        Profesor prof2 = new Profesor("Hugo","Rodriguez","hugo@gmail.com",
                "SO","informaica");
        Profesor prof3 = new Profesor("Ramon","Moreno","ramon@gmail.com",
                "sociologia","humanidades");

        Estudiante est1 = new Estudiante("nicolas","guitierrez","nicolas@gamil.com",
                22,"2 44");
        Estudiante est2 = new Estudiante("lucas","lopez","luca@gmail.com",
                13,"3 54");

        //ArrayList ListaEstudiantes = new ArrayList();

        ArrayList<Estudiante> ListaEstudiantes = new ArrayList<Estudiante>();
        ListaEstudiantes.add(est1);ListaEstudiantes.add(est2);

        ArrayList<Profesor> ListaProfesores = new ArrayList<Profesor>();
        ListaProfesores.add(prof1);ListaProfesores.add(prof2);ListaProfesores.add(prof3);





    }

}
