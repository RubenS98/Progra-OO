/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.*;
public class Main{
  public static void main(String[] args){
    int cont=0;

    Persona p1=new Persona("Ruben Sanchez", 13, 12, 1998);
    Persona p2=new Persona("Elvis Presley", 8, 11, 2000);
    Persona p3=new Persona("Sara Lomas", 4, 5, 1997);

    ArrayList<Persona> list=new ArrayList<Persona>();

    Direccion d1=new Direccion("Amargura", 47, 33456, "Naucalpan");
    Direccion d2=new Direccion("Verde", 34, 17904, "Tecamachalco");
    Direccion d3=new Direccion("Manzanos", 47, 96859, "Bosques");

    p1.setDireccion(d1);
    p2.setDireccion(d2);
    p3.setDireccion(d3);

    list.add(p1);
    list.add(p2);
    list.add(p3);

    Fecha f=new Fecha(3, 4, 2018);

    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
      System.out.println();
    }
    for(int i=0; i<list.size(); i++){
      if(list.get(i).esMayorDeEdad(f)){
        cont++;
      }
    }

    System.out.println("Hay "+cont+" persona(s) mayor(es) de edad.");
  }
}
