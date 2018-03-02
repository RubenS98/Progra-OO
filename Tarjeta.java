/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public enum Tarjeta {
  CLASICA(7500.0, 699.0, 29.0, 47.0),
  ORO(15000, 959.0, 25.0, 45.0),
  PLATINUM(45000.0, 1999.0, 16.0, 33.0),
  BLACK(100000.0,  4599.0, 9.9, 26.0);

  private final double ingresoMin;
  private final double anualidad;
  private final double min;
  private final double max;

  Tarjeta(double ingresoMin, double anualidad, double min, double max) {
      this.ingresoMin = ingresoMin;
      this.anualidad = anualidad;
      this.min = min;
      this.max = max;
  }

  public double getIngreso(){
    return ingresoMin;
  }
  public double getAnualidad(){
    return anualidad;
  }

  public double interesMensual() {
      return (interesAnual()/360.0)*30.0;
  }
  public double interesAnual() {
      return interesTIIE() + (max-min);
  }
  public double interesTIIE() {
      return (28.0*100.0)/360.0;
  }
}
