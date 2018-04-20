/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Circulo extends Punto{
  protected double radio;

  public Circulo(double x, double y, double radio){
    super(x, y);
    this.radio=radio;
  }

  public double getRadio(){
    return radio;
  }
  public double getDiametro(){
    return radio*2;
  }
  public double getCircunferencia(){
    return (radio*2)*3.1416;
  }
  public double getArea(){
    return (radio*radio)*3.1416;
  }
  public String toString(){
    String texto="";

    texto+="Centro del circulo: "+super.toString()+"\n";
    texto+="Radio: "+radio;

    return texto;
  }
}
