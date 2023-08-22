package Colecciones;

public class Matriz {

    public static void mostrarMatrices(int [][] a, int[][] b){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.println(a[i][j]);

            }
        }
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.println(b[i][j]);

            }
        }

    }
}
