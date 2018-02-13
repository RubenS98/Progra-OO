public class Student{
  private String nombre;
  private int id;
  private int unidades;

  public Student(String nombre, int id){
        this.nombre=nombre;
        this.id=id;
        unidades=0;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    public String getNombre(){
        return nombre;
    }
    public int getID(){
        return id;
    }
    public int getUnidades(){
        return unidades;
    }

    public void printStudent(){
      System.out.println(nombre+" (#"+id+")");
    }

    public void incrementUnits(int unidades){
      this.unidades+=unidades;
    }

    public boolean hasEnoughUnits(){
      if (unidades<180){
        return true;
      }
      return false;
    }
}
