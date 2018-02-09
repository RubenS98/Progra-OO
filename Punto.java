/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Punto{
  private double x;
  private double y;

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
  public double getX(){
      return x;
  }
  public double getY(){
      return y;
  }

  public double distancia(Punto coor){
      double distance=0;
      double disx=0;
      double disy=0;
      disx = x - coor.x;
      disy = y - coor.y;
      distance=Math.sqrt((disx*disx)+(disy*disy));

      return distance;
  }
}
