/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.*;
public class ClienteMain {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Scanner lectura = new Scanner(System.in);
        char answer = 'Y';
        int count =0, age;
        String name="", lastName="", number="";
        double balance;

        do{
          System.out.println("Escriba los siguientes datos: ");
          System.out.print("Nombre. ");
          name=lectura.next();
          System.out.print("Apellido. ");
          lastName=lectura.next();
          System.out.print("Edad. ");
          age=lectura.nextInt();
          System.out.println();

          Cliente client=new Cliente(name, lastName, age);

          System.out.print("Asignar tarjeta de credito: [Y/N]");
          char ans=lectura.next().charAt(0);
          System.out.println();

          if(answer=='Y'){
            System.out.println("Escriba los siguientes datos: ");
            System.out.print("Numero de Tarjeta. ");
            name=lectura.next();
            System.out.print("Limite de credito. ");
            balance=lectura.nextDouble();
            System.out.print("Fecha de Expedicion [dd mm yyyy]. ");
            int day=lectura.nextInt();
            int month=lectura.nextInt();
            int year=lectura.nextInt();
            System.out.println("Tipo de Tarjeta. Seleccione el numero de la opcion deseada: ");
            System.out.println("1. CLASICA");
            System.out.println("2, ORO");
            System.out.println("3, PLATINUM");
            System.out.println("4. BLACK");

            int tipotc=lectura.nextInt();

            TarjetaCredito tc=new TarjetaCredito();

            switch(tipotc){
              case 1:
                tc=new TarjetaCredito(number, balance, day, month, year, day, month, year+5, Tarjeta.CLASICA);
                break;
              case 2:
                tc=new TarjetaCredito(number, balance, day, month, year, day, month,
                year+5, Tarjeta.ORO);
                break;
              case 3:
                tc=new TarjetaCredito(number, balance, day, month, year, day, month,
                year+5, Tarjeta.PLATINUM);
                break;
              case 4:
                tc=new TarjetaCredito(number, balance, day, month, year, day, month,
                year+5, Tarjeta.BLACK);
                break;
              default:
                tc=new TarjetaCredito(number, balance, day, month, year, day, month,
                year+5);
                break;
            }
            client.setTarjetaCredito(tc);

          }
          lista.add(client);
          count++;
          System.out.println("Deseas agregar nuevo cliente: [Y/N]");
          answer=lectura.next().charAt(0);
          System.out.println();
        }while(answer=='Y');

        for(int i=0; i<lista.size(); i++){
          if(lista.get(i)!=null){
            lista.get(i).printCliente();
          }

        }

        /*
        TarjetaCredito tc=new TarjetaCredito("2435345645675678", 48000, 12, 10, 2015, 12, 10, 2019, Tarjeta.PLATINUM);

        Cliente c=new Cliente("Juan", "Perez", 22);
        c.setTarjetaCredito(tc);
        c.printCliente();
        */
    }
}
