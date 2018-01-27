/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.Random;
import java.util.Scanner;
public class SumaMatrices {
    public static void main(String[] args) {
        Random ran=new Random();
        int largo=0;
        int ancho=0;
        int res=0;
        int [][] matriz;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas de la matriz.");
        largo=lectura.nextInt();
        System.out.println("Introduzca el numero de columnas de la matriz.");
        ancho=lectura.nextInt();

        System.out.println();
        matriz=new int [largo][ancho];

        for(int r=0; r<matriz.length; r++){
            for(int c=0; c<matriz[0].length; c++){
                matriz[r][c]=ran.nextInt(20)+1;
        }
        }
        for(int r=0; r<matriz.length; r++){
            for(int c=0; c<matriz[0].length; c++){
               System.out.print(matriz[r][c]+"\t");
        }
            System.out.println();
        }
        System.out.println();

        largo=largo-1;
        ancho=ancho-1;

        res=suma(matriz, largo, ancho);

        System.out.println("La suma da "+res+".");
    }//cierre de main

    public static int suma(int [][]matriz, int r, int c){
        if(r==0 && c==0){
            return matriz[r][c];
        }
        else if(c==0){
            return matriz[r][c]+suma(matriz, r-1, matriz[0].length-1);
        }
        else{
            return matriz[r][c]+suma(matriz, r, c-1);
        }
    }
    }
