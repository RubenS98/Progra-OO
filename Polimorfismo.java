/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.*;
public class Polimorfismo{

private static Integer max=new Integer(0);

  public static void main(String[] args){
    ArrayList<Object> lista=new ArrayList<Object>();

    ArrayList<Object> lista1=new ArrayList<Object>();
    lista1.add(new Integer(1));
    lista1.add(new Integer(7));
    lista1.add(new Integer(3));

    ArrayList<Object> lista2=new ArrayList<Object>();
    lista2.add(new Integer(1));
    lista2.add(new Integer(7));
    lista2.add(new Integer(3));

    ArrayList<Object> lista3=new ArrayList<Object>();
    lista3.add(new Integer(9));
    lista3.add(new Integer(8));

    ArrayList<Object> lista4=new ArrayList<Object>();
    lista4.add(new Integer(10));
    lista4.add(new Integer(4));

    lista2.add(lista4);
    lista2.add(new Integer(11));

    lista.add(lista1);
    lista.add(lista2);
    lista.add(lista3);

    System.out.println(mayorNumero(lista));

    //System.out.println(array[0].getClass() == Integer.class? "Integer":"Array");
    //System.out.println(array[1].getClass() == Integer.class? "Integer":"Array");

  }

  public static int mayorNumero(ArrayList list){
    for(int i=0; i<list.size(); i++){
      if(list.get(i) instanceof ArrayList){
        mayorNumero((ArrayList)list.get(i));
      }
      else{
        if((Integer)list.get(i)> max){
          max=(Integer)list.get(i);
        }
      }
    }

    return max;
  }
}
