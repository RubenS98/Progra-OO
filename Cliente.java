/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private TarjetaCredito tc;

    private static int count=0;

    public Cliente(String nombre, String apellido, int edad){
        count++;
        this.id=count;
        this.nombre=nombre;
        this. apellido=apellido;
        this.edad=edad;
    }

    public void setTarjetaCredito(TarjetaCredito tc){
        this.tc=tc;
    }

    public void printCliente(){
        System.out.printf("Id: %d\nNombre: %s %s\n", id, nombre, apellido);
        if(tc != null){
            tc.printTC();
        }
        else{
            System.out.println("El cliente no tiene asignada targeta de credito.");
        }
    }
}
