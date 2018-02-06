/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.Scanner;
public class SopaLetras {
    public static void main (String[] args){
        String [][] bi = {{"M", "R", "D", "F"},{"A", "Y", "N", "T"},{"N","O", "N", "A"},
            {"O", "S", "D", "Y"},{"J", "G", "H", "H"}};
        Scanner lectura = new Scanner(System.in);
        String palabra="";
        int repeticiones=0;

        for(int r=0; r<bi.length; r++){
            for(int c=0; c<(bi[0].length); c++){
                System.out.print(bi[r][c]+" ");
            }
            System.out.println();
        }

        System.out.println("Escribe la palabra que quieres buscar en la sopa de letras (en mayusculas)");
        palabra=lectura.next();

        if(palabra.length()>bi.length){
          System.out.println("Esa palabra no cabe en la sopa de letras. Elige otra.");
          palabra=lectura.next();
        }

        System.out.println();
        repeticiones=apariciones(bi, palabra);
        System.out.println("La palabra "+palabra+" aparece "+repeticiones+" veces en la sopa de letras.");

    }//cierre de main

    public static int apariciones (String[][] bi, String palabra){
        int cont=0;
        int cont2=0;
        int largo=palabra.length();
        String sum="";
        String sum2="";

        for(int r=0; r<bi.length; r++){
            for(int c=0; c<(bi[0].length-(largo-1)); c++){
                while(cont2!=largo){
                  sum=sum+bi[r][c+cont2];
                  cont2++;
                }
                if(sum.equalsIgnoreCase(palabra)){
                  cont++;
                }
                sum="";
                cont2=largo-1;
                while(cont2!=-1){
                  sum2=sum2+bi[r][c+cont2];
                  cont2--;
                }
                cont2=0;
                if(sum2.equalsIgnoreCase(palabra)){
                  cont++;
                }
                sum2="";
            }
        }

        for(int r=0; r<bi.length-(largo-1); r++){
            for(int c=0; c<(bi[0].length); c++){
                while(cont2!=largo){
                  sum=sum+bi[r+cont2][c];
                  cont2++;
                }
                if(sum.equalsIgnoreCase(palabra)){
                  cont++;
                }
                sum="";
                cont2=largo-1;
                while(cont2!=-1){
                  sum2=sum2+bi[r+cont2][c];
                  cont2--;
                }
                cont2=0;
                if(sum2.equalsIgnoreCase(palabra)){
                  cont++;
                }
                sum2="";
            }
        }

        return cont;
    }
}
