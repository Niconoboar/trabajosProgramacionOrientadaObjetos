public class Matriz {
    static int[][] mA;
    static int[][] mB;

    public static void mostrarMatrices(int [][] a, int[][] b){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");

        }
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+ "\t");

            }
        }
        mA =a;
        mB =b;

    }
}
