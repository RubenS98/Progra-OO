/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.Arrays;
import java.util.Scanner;

public class Filas {
    static int[] fila=new int[4];

    public static void main (String[] args){
        System.out.println(Arrays.toString(fila));
        push(2);
        System.out.println(Arrays.toString(fila));
        push(3);
        System.out.println(Arrays.toString(fila));
        push(4);
        System.out.println(Arrays.toString(fila));
        push(5);
        System.out.println(Arrays.toString(fila));
        push(6);
        System.out.println(Arrays.toString(fila));
        push(7);
        System.out.println(Arrays.toString(fila));
        pop();
        System.out.println(Arrays.toString(fila));
        pop();
        System.out.println(Arrays.toString(fila));
        pop();
        System.out.println(Arrays.toString(fila));
        pop();
        System.out.println(Arrays.toString(fila));
    }

    public static void push (int a){
        int original;
        int remplazo=a;
        int remplazo2;

        for(int i=0; i<fila.length; i++){
            original=fila[i];
            remplazo2=original;
            fila[i]=remplazo;
            remplazo=remplazo2;
        }
    }//cierre de push

    public static void pop (){
        boolean cumplido=false;

        for(int i=(fila.length-1); i>=0; i--){
            if(fila[i]==0 && cumplido==false){

            }
            else if (fila[i]!=0 && cumplido==false){
              fila[i]=0;
              cumplido=true;
            }
        }
    }//cierre de push
}
