/*
Ruben Sanchez
A01021759
Programacion Orientada a Objetos
*/
import java.util.Scanner;
public class CanguroTest {
    public static void main(String[] args) {
        Canguro can1=new Canguro();
        Canguro can2=new Canguro();
        Scanner lectura=new Scanner(System.in);
        String conclusion;

        System.out.println("Escribe los valores de la posicion 1, la velocidad 1, la posicion 2 y la velocidad 2"
                + " (en ese orden) separados por espacios.");

        can1.setPosicion(lectura.nextInt());
        can1.setVelocidad(lectura.nextInt());
        can2.setPosicion(lectura.nextInt());
        can2.setVelocidad(lectura.nextInt());

        conclusion=can1.comparacion(can2);

        System.out.println(conclusion);
    }
}
