/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public String FormatoFecha(){
        return String.format("%2d/%2d/%d", dia, mes, anio);
    }
}
