/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Direccion{
  private String calle;
  private int numero;
  private int codigoPostal;
  private String ciudad;

  public Direccion(String calle, int numero, int codigoPostal, String ciudad){
    this.calle=calle;
    this.numero=numero;
    this.codigoPostal=codigoPostal;
    this.ciudad=ciudad;
  }

  public String getCalle(){
    return calle;
  }
  public int getNumero(){
    return numero;
  }
  public int getCodigo(){
    return codigoPostal;
  }
  public String getCiudad(){
    return ciudad;
  }

}
