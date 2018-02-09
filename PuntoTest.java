/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class PuntoTest{
  public static void main(String[] args){
    Punto p1 = new Punto(2, 3);
    Punto p2 = new Punto(5, 8);

    System.out.println(p1.distancia(p2));
  }
}
