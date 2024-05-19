package ejercicio5;

public class ej5 {

    int[] arreglo={4, 8, 12, 1, 9, 20,2};

    int[] resultadoC = new int[2];

    public int[] calcularConReturn(){
        int[] resultado = new int[2];
        int suma=0;
        int max=-1; int min=999;

        for (int i = 0; i < arreglo.length; i++) {
            suma+=arreglo[i];
            if (max>arreglo[i])
                max=arreglo[i];
            if(min<arreglo[i])
                min=arreglo[i];
        }

        suma=suma/arreglo.length;

        resultado[0]=max; resultado[1]=min; resultado[2]=suma;
        return resultado;

    }

    public void calcularSinReturn(int[] resultado){

        int suma=0;
        int max=-1; int min=999;

        for (int i = 0; i < arreglo.length; i++) {
            suma+=arreglo[i];
            if (max>arreglo[i])
                max=arreglo[i];
            if(min<arreglo[i])
                min=arreglo[i];
        }

        suma=suma/arreglo.length;

        resultado[0]=max; resultado[1]=min; resultado[2]=suma;
    }
}
