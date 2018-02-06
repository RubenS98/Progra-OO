/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Canguro {
    private int posicion;
    private int velocidad;

    public void setPosicion(int posicion){
        this.posicion=posicion;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    public int getPosicion(){
        return posicion;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public String comparacion(int posicion2, int velocidad2){
        boolean valido=false;

        if(posicion>posicion2 && velocidad>=velocidad2){

           return "No";
        }
        else if (posicion2>posicion && velocidad2>=velocidad){

           return "No";
        }
        else if(posicion2>posicion){
           while(posicion2>posicion && valido==false){
               posicion2+=velocidad2;
               posicion+=velocidad;

               if(posicion2==posicion){
                   valido=true;
               }
           }//cierre while
           if(valido==true){
               return "Si";
           }
           else{
              return "No";
           }

        }
        else if(posicion>posicion2){
            while(posicion>posicion2 && valido==false){
               posicion2+=velocidad2;
               posicion+=velocidad;

               if(posicion2==posicion){
                   valido=true;
               }
           }//cierre while
           if(valido==true){
               return "Si";
           }
           else{
              return "No";
           }
        }
        else{
           return "Si";
        }


    }
}
