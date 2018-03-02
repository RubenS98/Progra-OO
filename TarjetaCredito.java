/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class TarjetaCredito {
    private String numero;
    private double saldo;
    private Fecha fechaExpiracion;
    private Fecha fechaExpedicion;
    private Tarjeta t;

    public TarjetaCredito(String numero, double saldo, int diaexpe, int mesexpe, int anioexpe, int diaexpi, int mesexpi, int anioexpi, Tarjeta t){
        this.numero=numero;
        this.saldo=saldo;
        fechaExpiracion=new Fecha(diaexpi, mesexpi, anioexpi);
        fechaExpedicion=new Fecha(diaexpe, mesexpe, anioexpe);
        this.t=t;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void compras(double cantidad){
        if(cantidad>saldo){
            System.out.println("Fondos insuficientes");
        }
        else{
            saldo=saldo-cantidad;
        }
    }

    public void printTC(){
        System.out.printf("Tarjeta de Credito: %s\nSaldo:%.2f\n", numero, saldo);
        System.out.printf("Fecha de Expiracion: %s\nFecha de Expedicion:%s\n", fechaExpiracion.FormatoFecha(), fechaExpedicion.FormatoFecha());
        if(t.getAnualidad()==699){
          System.out.println("Tipo de Tarjeta: Clasica");
        }
        else if(t.getAnualidad()==959){
          System.out.println("Tipo de Tarjeta: Oro");
        }
        else if(t.getAnualidad()==1999){
          System.out.println("Tipo de Tarjeta: Platinum");
        }
        else{
          System.out.println("Tipo de Tarjeta: Black");
        }
        System.out.printf("Ingreso Minimo: %.2f\nAnualidad:%.2f\n", t.getIngreso(), t.getAnualidad());
        System.out.printf("TIEE: %.2f\nTIA: %.2f\nTIM: %.2f\n", t.interesTIIE(), t.interesAnual(), t.interesMensual());
    }
}
