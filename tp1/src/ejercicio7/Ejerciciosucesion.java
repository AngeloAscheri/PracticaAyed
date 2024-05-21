package ejercicio7;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class Ejerciciosucesion {


    private int aux(int n, List<Integer> lista){

        lista.add(n);
        
        if (n==1)
            return 1;
        if (n%2==0)
            return aux(n/2,lista);
        else {
            return aux(3*n+1,lista);
        }
    }

    public List<Integer> calcularSusesion(int n) {

        List<Integer> sus = new ArrayList<Integer>();
        aux(n,sus);
        return sus;

    }


    }
