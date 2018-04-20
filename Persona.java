
/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Persona{
  private String nombre;
  private Direccion d;
  private Fecha f;

  public Persona(String nombre, int dia, int mes, int anio){
    this.nombre=nombre;
    this.f=new Fecha(dia, mes, anio);
  }

  public void setDireccion(Direccion d){
    this.d=d;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public Direccion getDireccion(){
    return d;
  }
  /*public void setFecha(Fecha f){
    this.f=f;
  }
  */
  public Fecha getFecha(){
    return f;
  }

  public boolean esMayorDeEdad(Fecha f1){
    if((f1.getAnio()-f.getAnio())>18){
      return true;
    }
    else if((f1.getAnio()-f.getAnio())==18){
      if(f.getMes()<f1.getMes()){
        return true;
      }
      else if(f.getMes()==f1.getMes()){
        if(f.getDia()<=f1.getDia()){
          return true;
        }
        else{
          return false;
        }
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
  public String toString(){
    String texto="";
    texto+="Nombre: "+nombre+"\n";
    texto+="Fecha Nacimiento: "+f.getDia()+"-"+f.getMes()+"-"+f.getAnio()+"\n";
    texto+="Direccion: Calle "+d.getCalle()+" No. "+d.getNumero()+", "+d.getCodigo()+", "+d.getCiudad();

    return texto;
  }
}
