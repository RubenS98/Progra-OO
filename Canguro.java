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
    public String comparacion(Canguro can){
        boolean valido=false;

        if(posicion>can.posicion && velocidad>=can.velocidad){

           return "No";
        }
        else if (can.posicion>posicion && can.velocidad>=velocidad){

           return "No";
        }
        else if(can.posicion>posicion){
           while(can.posicion>posicion && valido==false){
               can.posicion+=can.velocidad;
               posicion+=velocidad;

               if(can.posicion==posicion){
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
        else if(posicion>can.posicion){
            while(posicion>can.posicion && valido==false){
               can.posicion+=can.velocidad;
               posicion+=velocidad;

               if(can.posicion==posicion){
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
