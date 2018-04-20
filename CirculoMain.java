/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class CirculoMain{
  public static void main(String[] args){
    Circulo c=new Circulo(4, 5, 8);

    System.out.println(c);
    System.out.println();
    System.out.println("Radio: "+c.getRadio());
    System.out.println("Diametro: "+c.getDiametro());
    System.out.println("Circunferencia: "+c.getCircunferencia());
    System.out.println("Area: "+c.getArea());
  }
}
