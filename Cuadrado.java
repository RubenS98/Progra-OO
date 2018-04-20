public class Cuadrado extends Figura{
  private double x;
  private double y;

  public Rectangulo(String color, double x, double y){
    super(color);
    this.x=x;
    this.y=y;
  }

  @Override
  public double area(){
    return x*y;
  }

  @Override
  public double perimetro(){
    return 4*x;
  }
}
