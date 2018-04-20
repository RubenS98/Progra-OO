/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Punto{
  protected double x;
  protected double y;

  public Punto(double x, double y){
      this.x=x;
      this.y=y;
  }

  public void setX(double x){
      this.x=x;
  }
  public void setY(double y){
      this.y=y;
  }

  public String toString(){
    String texto="";
    texto+="("+x+","+y+")";

    return texto;
  }

}
