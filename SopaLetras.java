package javaapplication1;

public class SopaLetras {
    public static void main (String[] args){
        String [][] bi = {{"M", "R", "D", "F", "O"},{"A", "R", "N", "T", "L"},{"N","O", "N", "A", "M"},
            {"O", "S", "D", "Y", "D"},{"J", "G", "H", "H", "L"}};
        
        for(int r=0; r<bi.length; r++){
            for(int c=0; c<(bi[0].length); c++){
                System.out.print(bi[r][c]+" ");      
            }
            System.out.println(); 
        }
           
        System.out.println("Palabra a buscar: MANO");
        
        apariciones(bi);
        System.out.println();
        
    }//cierre de main
    
    public static int apariciones (String[][] bi){
        int cont=0;
        String sum="";
        String sum2="";
        String palabra="MANO";
        
        for(int r=0; r<bi.length-palabra.length(); r++){
            for(int c=0; c<(bi[0].length-palabra.length()); c++){
                sum=bi[r][c]+bi[r][c+1]+bi[r][c+2]+bi[r][c+3];
            }
        }
        System.out.println();
        return cont;
    }
}