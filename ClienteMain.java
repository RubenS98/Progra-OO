/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
public class ClienteMain {
    public static void main(String[] args) {
        TarjetaCredito tc=new TarjetaCredito("2435345645675678", 48000, 12, 10, 2015, 12, 10, 2019, Tarjeta.PLATINUM);

        Cliente c=new Cliente("Juan", "Perez", 22);
        c.setTarjetaCredito(tc);
        c.printCliente();
    }
}
