public class Persona1 {

    private String nombre;
    private String apellido;
    private int edad;
    private String alias;

    public Persona1(){
        nombre="Generico";
        apellido="Generico";
        edad=20;
        alias="Sr";
    }

    public Persona1(String nombre){
        this.nombre=nombre;
        this.apellido="Cualquiera";
    }

    public Persona1(String nombre, String apellido, int edad, String alias){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.alias=alias;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getAlias(){
        return alias;
    }
    public void printPersona(){
        System.out.println("Persona: "+alias+". "+nombre+" "+apellido);
        System.out.println("Edad: "+edad);
    }
}
